package es.upm.dit.isst.eDOC.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;
import es.upm.dit.isst.eDOC.model.Encuesta;
import es.upm.dit.isst.eDOC.model.Usuario;


@WebServlet("/FormLoginServlet")
public class FormLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final String ADMIN_EMAIL = "root";
    private final String ADMIN_PASSWORD = "root"; 
       
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                       throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        Client client = ClientBuilder.newClient(new ClientConfig());

        // autenticacion Gestor
        if( ADMIN_EMAIL.equals(email) && ADMIN_PASSWORD.equals(password) ) {        
             req.getSession().setAttribute("email_admin", true);
             getServletContext().getRequestDispatcher("/gestor_inicio.jsp").forward(req, resp);
            return;
        }
        
        // autenticacion Alumno
        if ( email.indexOf("@alumnos.upm.es") > -1) {
                req.getSession().setAttribute("email_alumno", email);
                getServletContext().getRequestDispatcher("/alumno_inicio.jsp").forward(req,resp);
              return;

        }     
        
     // autenticacion Alumno
        if ( email.indexOf("@upm.es") > -1) {
                req.getSession().setAttribute("email_profesor", email);
                
                String departamento = client.target(URLHelperUsuarios.getURL()+ "/" + email)
        				.request().accept(MediaType.APPLICATION_JSON).get(Usuario.class).getDepartamento();
        		
                req.getSession().setAttribute("departamento", departamento);
                System.out.print(departamento);
                
                getServletContext().getRequestDispatcher("/profesor_inicio.jsp").forward(req,resp);
              return;

        }     
    }
}
