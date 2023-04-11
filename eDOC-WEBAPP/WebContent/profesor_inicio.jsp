<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html  lang="en">
<head>
    <title>eDOC</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="static/css/profesor_inicio.css" type="text/css" />
    <link rel="stylesheet" href="static/css/circular-prog-bar.css" type="text/css" />
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
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
                  <i class="fa fa-user-circle" aria-hidden="true">  <%= session.getAttribute("email_profesor") %></i>
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

    <div class ="fondo">
        <h1 class="bienvenido">Bienvenido a eDoc</h1>
        <h2 class="docente">Revisa tus resultados como docente</h2>
        <div class="padre">
          <div align="center">
         	<c:set var="departamento" value="${departamento}"/>
         	<c:choose>
         		<c:when test="${departamento == 'SSR'}"> 
            		<img src="static/img/SSR.png" width="250" height="250" class="departamento" />
            	</c:when>
				<c:when test="${departamento == 'DIT'}"> 
            		<img src="static/img/DIT.png" width="250" height="250" class="departamento" />
            	</c:when>
            	<c:when test="${departamento == 'DIE'}"> 
            		<img src="static/img/DIE.png" width="250" height="250" class="departamento" />
            	</c:when>
            	<c:when test="${departamento == 'IES'}">
            		<img src="static/img/IES.png" width="250" height="250" class="departamento" />
            	</c:when>
            	<c:when test="${departamento == 'IOR'}">
            		<img src="static/img/IOR.png" width="250" height="250" class="departamento" />
            	</c:when>
            	<c:when test="${departamento =='LIA'}">
            		<img src="static/img/LIA.png" width="250" height="250" class="departamento" />
            	</c:when>
            	<c:when test="${departamento =='LIA'}">
            		<img src="static/img/TFB.png" width="250" height="250" class="departamento" />
            	</c:when>
            	<c:otherwise>
            		<img src="static/img/alumnos.png" width="250" height="250" class="departamento" />
            	</c:otherwise>
            </c:choose>
        </div>
        <h3 class="encuestas">Encuestas respondidas</h3>
        <div class="porcentaje">
            <div class="progress-circle over50 p66">
                <span>66%</span>
                <div class="left-half-clipper">
                    <div class="first50-bar"></div>
                    <div class="value-bar"></div>
                </div>
            </div>
        </div>
        </div>
        
    </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
