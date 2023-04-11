package es.upm.dit.isst.eDOC.servlets;


public class URLHelperUsuarios {
    public static String getURL() {
            String envValue = System.getenv("eDOCSERVICE_SRV_SERVICE_HOST");
            if(envValue == null)
                    return "http://localhost:8080/eDOC-SERVICE/rest/Usuarios";
            else
                    return envValue;
    }
}
