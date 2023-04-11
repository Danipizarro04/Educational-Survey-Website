<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html lang="en">
  <head>
    <title>eDOC</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="static/css/alumno_encuestas.css" type="text/css" />
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" >
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  </head>
  <body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item">
              <a class="nav-link" href="profesor_inicio.jsp"><i class= "fa fa-home"></i>Inicio</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="AsignaturasProfesor"><i class= "fa fa-paste"></i>Asignaturas</a>
            </li>
          </ul>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ml-auto">
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <i class="fa fa-user-circle" aria-hidden="true"> <%= session.getAttribute("email_profesor") %> </i>
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <a class="dropdown-item" href="index.html"><i class="fa fa-sign-out-alt mr-2" aria-hidden="true"></i>Cerrar sesión</a>
                  <div class="dropdown-divider"></div>
                  <a class="dropdown-item" href="#">Editar perfil</a>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </nav>

      <h2 class="subtitle"> Asignaturas impartidas:</h2>
      <div class="padre">
      <!--<div class="hijo">-->
        <table class="table  table-striped ">
            <thead>
              <tr>
                <th scope="col">Curso</th>
                <th scope="col">Nombre</th>
                <th scope="col">Acrónimo</th>
                <th scope="col">Realizadas</th>
                <th scope="col">Ver encuestas</th>
              </tr>
            </thead>
            <c:forEach items="${asignaturas}" var="a">
             
            <tbody>
            	<tr id="asignatura'+a.id+'">
               		<td>${a.curso}</td>
                	<td>${a.name}</td>
                	<td>${a.acronimo}</td>
                	<td>2/${a.usuarios_matriculados}</td>
                	<td><button class="btn btn-warning">Resultado</button></td>
                	
         
              	</tr>              	
            </tbody>
            </c:forEach>
            
            
            
            
          </table>

      <!--</div>-->
    </div>
      
 
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
 	<script>
 		/*const botones = document.querySelectorAll(".botones");
 		botones.forEach(function(botones){
 			botones.addEventListener('click', function(evento){
 				if (!event.target.matches(".botones")){
 					return;
 					alert("Le has dado click");
 				}
 				alert("No le has dado click");
 			})
 			
 		});*/
 		/*var botones = document.getElementsByClassName('botones')
 		const boton = document.querySelector(".botones");
 		boton.addEventListener("click", function(event){

 			alert("Le has dado click");
 			event.currentTarget.parentNode.remove()
 		});*/
	</script>
	<script> 
		/*$(document).ready(function(){
			$('.botones').click(function(){
				eliminar(id_fila_selected);
			});
		});
		function eliminar(id_fila){
			$('#'+id_fila).remove();
		}*/
	</script>
	
	
 
  </body>
</html>