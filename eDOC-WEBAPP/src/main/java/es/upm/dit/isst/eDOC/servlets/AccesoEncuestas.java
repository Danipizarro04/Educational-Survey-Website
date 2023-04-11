package es.upm.dit.isst.eDOC.servlets;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;

import es.upm.dit.isst.eDOC.model.Asignatura;
import es.upm.dit.isst.eDOC.model.Usuario;


@WebServlet("/AccesoEncuestas")
public class AccesoEncuestas extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Client client = ClientBuilder.newClient(new ClientConfig());
		String email = (String) request.getSession().getAttribute("email_alumno");
		System.out.print(email);
		
		int id = Integer.parseInt((String)request.getParameter("id"));
		System.out.print(id);
		request.getSession().setAttribute("id_asignatura_seleccionada", id);
		
		/*String index = ((String)request.getParameter("var"));
		System.out.print(index);
		request.getSession().setAttribute("index", index);*/
		
		getServletContext().getRequestDispatcher("/Encuestas.html").forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

