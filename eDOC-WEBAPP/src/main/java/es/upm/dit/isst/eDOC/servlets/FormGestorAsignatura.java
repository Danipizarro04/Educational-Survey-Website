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

import es.upm.dit.isst.eDOC.model.Asignatura;

/**
 * Servlet implementation class FormAsignatura
 */
@WebServlet("/FormGestorAsignatura")
public class FormGestorAsignatura extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 Client client = ClientBuilder.newClient(new ClientConfig());
		List<Asignatura> asignaturas = client.target(URLHelperAsignaturas.getURL())
	    		 .request().accept(MediaType.APPLICATION_JSON)
         		.get(new GenericType<List<Asignatura>>() {});
         req.setAttribute("asignaturas", asignaturas);  
		getServletContext().getRequestDispatcher("/gestor_resultados.jsp").forward(req,resp);
		return;
	}
	
}