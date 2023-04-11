package es.upm.dit.isst.eDOC.rest;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class GrupoApp extends ResourceConfig  {
	
	public GrupoApp() {
        packages("es.upm.dit.isst.eDOC.rest");
}

}

