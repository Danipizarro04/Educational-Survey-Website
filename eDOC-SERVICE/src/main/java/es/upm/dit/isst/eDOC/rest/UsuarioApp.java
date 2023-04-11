package es.upm.dit.isst.eDOC.rest;

import javax.ws.rs.ApplicationPath;



import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class UsuarioApp extends ResourceConfig {
	public UsuarioApp() {
        packages("es.upm.dit.isst.eDOC.rest");
}

}
