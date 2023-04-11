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

import es.upm.dit.isst.eDOC.dao.AsignaturaDAOImplementation;
import es.upm.dit.isst.eDOC.dao.UsuarioDAOImplementation;
import es.upm.dit.isst.eDOC.model.Asignatura;
import es.upm.dit.isst.eDOC.model.Usuario;

@Path("/Asignaturas")
public class AsignaturaResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Asignatura> readAll() {
	     return AsignaturaDAOImplementation.getInstance().readAll();
	}
		
		
	/*@GET
	@Path("{asignaturas}/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Asignatura> delete_asignatura (@PathParam("id") int id) {
	   return AsignaturaDAOImplementation.getInstance().delete_asignatura(id);
	}
	*/
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Asignatura read(@PathParam("id") int id) {
	   return AsignaturaDAOImplementation.getInstance().read(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Asignatura tnew) throws URISyntaxException {
		Asignatura t = AsignaturaDAOImplementation.getInstance().create(tnew);
	    if (t != null) {
	       URI uri = new URI("/eDOC-SERVICE/rest/Asignaturas/" + t.getId());
	       return Response.created(uri).build();
	    }
	    return Response.status(Response.Status.NOT_FOUND).build();
	}
	
	@DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") char  id) {
		Asignatura rold = AsignaturaDAOImplementation.getInstance().read(id);
        if (rold == null)
            return Response.notModified().build();
        AsignaturaDAOImplementation.getInstance().delete(rold);
        return Response.ok().build();
    }

}