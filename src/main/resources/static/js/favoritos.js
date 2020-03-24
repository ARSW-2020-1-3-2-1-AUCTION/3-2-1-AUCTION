var favoritos =(function(){
	
	var lista = [];
	
	function getFav(fav) {
			var fila = "<div class=\"grid-1-5\"><h4><b>"+fav.nombre+"</b></h4><h4>Valor: "+fav.valor+"</h4><a href=\"articulo.html?var1="+fav.id+"&user="+document.getElementById("user").innerText+"\" class=\"button\">Ir</a></div>";
            $("#favoritosTable").append(fila);
	}
	
	function anadirFavoritos(retorno) {
		$("#favoritosTable div").remove();
		retorno.map(function(fav){
			favoritosCliente.getArticulo(fav.publicacion,getFav);
        })
	}
	
	function getFavoritos() {
		favoritosCliente.getFavoritos(document.getElementById("user").innerText,anadirFavoritos);
	}
	
	return {
		getFavoritos: getFavoritos
	};
	
})();