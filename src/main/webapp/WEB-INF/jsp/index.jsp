<%@ page language="java" contentType="text/html; utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html ng-app="MyFirstApp">
<head>
	<meta charset="utf-8">
	<title>Welcome</title>
</head>
<body ng-controller="FirstController">
	<label>Ingrese un nuevo comentario:</label>
	<input type="text" ng-model="nuevoComentario.comentario">
	<br>
	<label>Ingrese su nombre</label>
	<input type="text" ng-model="nuevoComentario.username">
	<br>
	<button ng-click="agregarComentario()">Agregar Comentario</button>
	
	<h3>Comentarios</h3>
 	<ul>
 		<li ng-repeat="comentario in comentarios">
			{{comentario.comentario}} - <strong>{{comentario.username}}</strong> 			
 		</li>
 	</ul>

	<!-- Las dependencias se JS se cargan al final para que no retrase la carga de la pagina -->
 	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.8/angular.min.js"></script>
	<script type="text/javascript" src="js/controller.js"></script> 	
</body>
</html>