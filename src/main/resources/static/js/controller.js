var app = angular.module("MyFirstApp", []);
/*
 * Como buena practica en produccion se comprimen los archivos JS 
 * esto se llama minificado, esto tambien cambia el codigo por 
 * palabras mas pequeñas.
 * Se cambio la declaracion de la funcion anonima por un arreglo 
 * con la lista de las dependencias seguido de la funcion anomina
 * con un alias de las dependencias.
 * Esto se hace para que al momento de minificar no se le cambie el 
 * nombre a las variables de angular
 * El minificado no cambia nombre a cadenas
 * */
app.controller("FirstController", ["$scope",function(scope) {
	scope.nombre = "Aldo";
	scope.nuevoComentario={};
	scope.comentarioBack={};
	scope.comentarios=[
		{
			comentario: "Creo que ests pagina esta sencilla pero funcional",
			username: "Juanito"
		},
		{
			comentario: "Me gusto la pagina funciona bien",
			username: "Pedro"			
		}	
	];
	
	scope.agregarComentario = function(){
		scope.comentarioBack = scope.nuevoComentario; 
		scope.comentarios.push(scope.comentarioBack);
		scope.nuevoComentario={};
	}
	
}]);
