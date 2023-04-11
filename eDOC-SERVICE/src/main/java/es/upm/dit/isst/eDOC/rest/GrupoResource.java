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

import es.upm.dit.isst.eDOC.dao.GrupoDAOImplementation;
import es.upm.dit.isst.eDOC.model.Grupo;

@Path("/Grupos")
public class GrupoResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Grupo> readAll () {
	     return GrupoDAOImplementation.getInstance().readAll();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Grupo tnew) throws URISyntaxException {
		Grupo t = GrupoDAOImplementation.getInstance().create(tnew);
	    if (t != null) {
	       URI uri = new URI("/eDOC-SERVICE/rest/Grupos/" + t.getId());
	       return Response.created(uri).build();
	    }
	    return Response.status(Response.Status.NOT_FOUND).build();
	}
	
	@DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") char  id) {
		Grupo rold = GrupoDAOImplementation.getInstance().read(id);
        if (rold == null)
            return Response.notModified().build();
        GrupoDAOImplementation.getInstance().delete(rold);
        return Response.ok().build();
    }


}
