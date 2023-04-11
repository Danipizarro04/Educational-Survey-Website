<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html lang="en">
  <head>
    <title>eDOC</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/gestor_inicio.css" type="text/css" />
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
              <a class="nav-link" href="profesor_asignaturas.jsp"><i class= "fa fa-paste"></i>Asignaturas</a>
            </li>
          </ul>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ml-auto">
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <i class="fa fa-user-circle" aria-hidden="true"><%= session.getAttribute("email_profesor") %></i>
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <a class="dropdown-item" href="login.html"><i class="fa fa-sign-out-alt mr-2" aria-hidden="true"></i>Cerrar sesión</a>
                  <div class="dropdown-divider"></div>
                  <a class="dropdown-item" href="#">Editar perfil</a>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </nav>
      <h2 class="subtitle"> Resultados generales:</h2>
      <div class="table-responsive">
        <table id='TablaPreguntas' class="table  table-striped table-bordered">
          <thead>
            <tr>
              <th scope="col">#</th>
              <th scope="col">1</th>
              <th scope="col">2</th>
              <th scope="col">3</th>
              <th scope="col">4</th>
              <th scope="col">5</th>
              <th scope="col">6</th>
              <th scope="col">7</th>
              <th scope="col">8</th>
              <th scope="col">9</th>
              <th scope="col">10</th>
              <th scope="col">11</th>
              <th scope="col">12</th>
              <th scope="col">13</th>
              <th scope="col">14</th>
              <th scope="col">15</th>
              <th scope="col">16</th>
              <th scope="col">17</th>
              <th scope="col">18</th>
              <th scope="col">19</th>
              <th scope="col">20</th>
              <th scope="col">21</th>
              <th scope="col">22</th>
              <th scope="col">23</th>
              <th scope="col">24</th>
              <th scope="col">25</th>
              <th scope="col">Conformidad</th>
              
            </tr>
          </thead>
          <tbody>
            <tr>
              <th id="fila1">1</td>
              <td>2</td>
              <td>5</td>
              <td>2</td>
              
            </tr>
            <tr>
              <th scope="row">2</td>
              <td>2</td>
              <td>2</td>
              <td>4</td>
            </tr>
            <tr>
              <th scope="row">3</td>
              <td>2</td>
              <td>5</td>
              <td>6</td>
            </tr>
            <tr>
              <th scope="row">4</td>
              <td>2</td>
              <td>3</td>
              <td>2</td>
            </tr>
          </tbody>
        </table>

      </div>
 
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->

      <script type="text/javascript">
      
        function addRow(TablaPreguntas) {
        // Obtiene una referencia a la tabla
        var tableRef = document.getElementById(TablaPreguntas);
      
        // Inserta una fila en la tabla, en el índice 0
        var newRow   = tableRef.insertRow(0);
      
        // Inserta una celda en la fila, en el índice 0
        var newCell  = newRow.insertCell(0);
      
        // Añade un nodo de texto a la celda
        var newText  = document.createTextNode('La media es: mediausuarios/usuariostotales');
        newCell.appendChild(newText);
      }
      
      // Llama a addRow() con el ID de la tabla
      addRow('TablaPreguntas');
      
      </script>
    
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
