var favoritos =(function(){
	
	var lista = [];
	var i = 0;
	
	function getFav(fav,i) {
		var fila = "<div class=\"grid-1-5\"><h4><b>"+fav.nombre+"</b></h4><h4>Valor: "+fav.valor+"</h4><div id=\"ima"+i+"\"  class='imagen2'></div><a href=\"articulo.html?var1="+fav.id+"&user="+document.getElementById("user").innerText+"\" class=\"button\">Ir</a></div>";
        $("#favoritosTable").append(fila);
		se(fav,i);
	}
	
	function se(fav,i) {
		fetch(fav.imagen)
			.then(res => res.blob()) // Gets the response and returns it as a blob
			.then(blob => {
				// Here's where you get access to the blob
				// And you can use it for whatever you want
				// Like calling ref().put(blob)

			// Here, I use it to make an image appear on the page
				const width = 265;
				const height = 180;
				let objectURL = URL.createObjectURL(blob);
				let myImage = new Image();
				myImage.src = objectURL;
				const elem = document.getElementById('ima'+i).appendChild(myImage)
				elem.width = width;
				elem.height = height;
				
			});
	}
	
	function anadirFavoritos(retorno) {
		$("#favoritosTable div").remove();
		i = 0;
		retorno.map(function(fav){
			favoritosCliente.getArticulo(fav.publicacion,getFav,i);
			i+=1;
        })
	}
	
	function getFavoritos() {
		favoritosCliente.getFavoritos(document.getElementById("user").innerText,anadirFavoritos);
	}
	
	return {
		getFavoritos: getFavoritos
	};
	
})();