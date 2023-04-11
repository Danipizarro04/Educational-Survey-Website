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
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

import es.upm.dit.isst.eDOC.model.*;
import es.upm.dit.isst.eDOC.servlets.*;


/**
 * Servlet implementation class AsignaturasProfesor
 */
@WebServlet("/AsignaturasProfesor")
public class AsignaturasProfesor extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Client client = ClientBuilder.newClient(new ClientConfig());
		String email = (String) request.getSession().getAttribute("email_profesor");
		//System.out.print(email);
	  
		List<Asignatura> asignaturas = client.target(URLHelperUsuarios.getURL()+ "/" + email)
				.request().accept(MediaType.APPLICATION_JSON).get(Usuario.class).getAsignaturas();
		
		request.getSession().setAttribute("asignaturas", asignaturas);
		request.getSession().setAttribute("numero_asignaturas", asignaturas.size());
		
		getServletContext().getRequestDispatcher("/profesor_asignaturas.jsp").forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
