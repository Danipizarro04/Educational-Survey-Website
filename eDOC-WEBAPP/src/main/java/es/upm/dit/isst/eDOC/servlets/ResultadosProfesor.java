/*package es.upm.dit.isst.eDOC.servlets;

import java.io.IOException;
import java.util.ArrayList;
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
import es.upm.dit.isst.eDOC.model.Encuesta;
import es.upm.dit.isst.eDOC.model.Grupo;
import es.upm.dit.isst.eDOC.model.Usuario;


@WebServlet("/ResultadosProfesor")
public class ResultadosProfesor extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Client client = ClientBuilder.newClient(new ClientConfig());
		String email = (String) request.getSession().getAttribute("email_profesor");
		//System.out.print(email);
		
		//Asignaturas impartidas
		List<Asignatura> asignaturas = client.target(URLHelperUsuarios.getURL()+ "/" + email)
				.request().accept(MediaType.APPLICATION_JSON).get(Usuario.class).getAsignaturas();
		
		List<Grupo> grupos = client.target(URLHelperUsuarios.getURL()+ "/" + email)
				.request().accept(MediaType.APPLICATION_JSON).get(Usuario.class).getGrupos();
	  
		for(int j = 0; j <asignaturas.size(); j++) { //devuelve las encuestas de las asignaturas impartidas por el profe
			List<Encuesta> todas_encuestas = client.target(URLHelperEncuestas.getURL()+ "/"+ asignaturas.get(j))
				.request().accept(MediaType.APPLICATION_JSON).get(new GenericType<List<Encuesta>>() {});
		}
		
		List<Encuesta> encuestas = new ArrayList<Encuesta>();
		
		for (int i = 0; i <todas_encuestas.size(); i++) {
			for (int j = 0; j <asignaturas.size(); j++) {
				if (todas_encuestas.get(i).getAsignatura() == asignaturas.get(j)){
					encuestas.add(todas_encuestas.get(i));
				}
			}
			if todas_encuestas.get(i).getAsignatura() == 
		}
		
		request.getSession().setAttribute("encuestas", encuestas);
		
		getServletContext().getRequestDispatcher("/profesor_resultados.jsp").forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}*/
