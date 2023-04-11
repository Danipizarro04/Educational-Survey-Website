package es.upm.dit.isst.eDOC.rest;

import java.net.URI;

import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import es.upm.dit.isst.eDOC.dao.UsuarioDAOImplementation;
import es.upm.dit.isst.eDOC.model.Usuario;

@Path("/Usuarios")
public class UsuarioResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> readAll() {
	     return UsuarioDAOImplementation.getInstance().readAll();
	}
		
	@GET
	@Path("rol/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> readAll_rol (@PathParam("id") String id) {
	   return UsuarioDAOImplementation.getInstance().readAll_rol(id);
	}
	
	@GET
	@Path("{email}")
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario read_email(@PathParam("email") String email) {
	   return UsuarioDAOImplementation.getInstance().read_email(email);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Usuario tnew) throws URISyntaxException {
		Usuario t = UsuarioDAOImplementation.getInstance().create(tnew);
	    if (t != null) {
	       URI uri = new URI("/eDOC-SERVICE/rest/Usuarios/" + t.getId());
	       return Response.created(uri).build();
	    }
	    return Response.status(Response.Status.NOT_FOUND).build();
	}
	
	@DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") int  id) {
        Usuario rold = UsuarioDAOImplementation.getInstance().read(id);
        if (rold == null)
            return Response.notModified().build();
        UsuarioDAOImplementation.getInstance().delete(rold);
        return Response.ok().build();
    }

}