var publicaciones =(function(){
	
	var lista = [];
	
	function getPub(retorno) {
		$("#misPublicTable div").remove();
		var i = 0;
		retorno.map(function(pub){
			var fila = "<div class=\"grid-1-5\"><h4><b>"+pub.nombre+"</b></h4><h4>Valor: "+pub.valor+"</h4><a href=\"articulo.html?var1="+pub.id+"&user="+document.getElementById("user").innerText+"\" class=\"button\">Ir</a></div>";
            $("#misPublicTable").append(fila);
			i+=1;
		})
	}
	
	function getPublicaciones() {
		publicacionesCliente.getPublicaciones(document.getElementById("user").innerText,getPub);
	}
	
	return {
		getPublicaciones: getPublicaciones
	};
	
})();