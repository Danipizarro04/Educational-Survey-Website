<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
 <title>eDOC</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="static/css/gestor_inicio.css" type="text/css" />
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" >
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

 <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item">
              <a class="nav-link" href="gestor_inicio.jsp"><i class= "fa fa-home"></i>Inicio</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="FormGestorAsignatura"><i class= "fa fa-paste"></i>Resultados</a>
            </li>
          </ul>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ml-auto">
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <i class="fa fa-user-circle" aria-hidden="true">  Usuario root</i>
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

 <table class="table  table-striped" id ="tabla">

            <thead>
              <tr>
                <th scope="col">id</th>
                <th scope="col">Asignatura</th>
                <th scope="col">Media Documentacion</th>
                <th scope="col">Media Evaluacion</th>
                <th scope="col">Media Estudiante</th>
                <th scope="col">Media Clases</th>
                <th scope="col">Media Profesorado</th>
                <th scope="col">Satisfaccion Global</th>
                <th scope="col">Media general de la Encuesta</th>
                
                
               
              </tr>
            </thead>
                       
            <c:forEach items= "${encuestas}" var="encuestai">
            <tbody>
            <tr>
                <td> ${encuestai.id}</td>
                <td> ${encuestai.asignatura.getName()}</td>
                <td> ${encuestai.media_Documentacion}</td>
                <td> ${encuestai.media_Evaluacion}</td>
                <td> ${encuestai.media_Estudiante}</td>
                <td> ${encuestai.media_Clases}</td>
                <td> ${encuestai.media_Profesorado}</td>
                <td> ${encuestai.media_Satisfaccion}</td>
                <td> ${encuestai.media_Encuesta}</td>
                
          
                </tr>
                </tbody>
               
            </c:forEach>
             </table>
</body>
</html>