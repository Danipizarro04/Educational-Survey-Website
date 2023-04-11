<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Botones</title>
<script>
	$(document).ready(function(){
		$('#bt_add').click(function(){
			agregar();
		});
		$('#bt_del').click(function(){
			eliminar(id_fila_selected);
		});
	});
	var cont =0;
	function agregar(){
		cont++;
		var fila = '<tr class = selected" id ="fila'+cont+'" onclick = "seleccionar(this.id);"><td>'+cont+'</td><td>texto x defecto</td><td>0.00</td></tr>';
	}
	function seleccionar(id_fila){
		if ($('#'+id_fila).hasClass('selecionada')){
			$('#'+id_fila).removeClass('seleccionada');
		}else{
			$('#'+id_fila).addClass('seleccionada');
		}
		id_fila_selected = id_fila;
	}
	
	function eliminar(id_fila){
		$('#'+id_fila).remove();
	}
</script>
</head>
<script src="js/jquery-2.1.1.min.js"></script>
<script src ="js/bootstrap.js"></script>
<body>
	<div id = "content">
		<label>Agregar filas de forma dinámica con JQuery</label>
		<button id = "bt_add" class = "btn btn-default">Agregar</button>
		<button id = "bt_del" class = "btn btn-default">Eliminar</button>
		<table>
		<thead>
			<tr>
				<td>nº</td>
				<td>Descripción</td>
				<td>Precio</td>
			</tr>
		
		</thead>
		</table>
	
	
	
	
	
	
	</div>

</body>
</html>