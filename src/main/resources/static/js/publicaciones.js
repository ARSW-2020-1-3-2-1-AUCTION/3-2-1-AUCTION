var publicaciones =(function(){
	
	var lista = [];
	
	function getPub(retorno) {
		$("#misPublicTable div").remove();
		var i = 0;
		retorno.map(function(pub){
			var fila = "<div class=\"grid-1-5\"><h4><b>"+pub.nombre+"</b></h4><h4>Valor: "+pub.valor+"</h4><div id=\"ima"+i+"\"  class='imagen2'></div><a href=\"articulo.html?var1="+pub.id+"&user="+document.getElementById("user").innerText+"\" class=\"button\">Ir</a></div>";
            $("#misPublicTable").append(fila);
			se(pub,i);
			i+=1;
		})
	}
	
	function se(pub,i) {
		fetch(pub.imagen)
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
	
	function getPublicaciones() {
		publicacionesCliente.getPublicaciones(document.getElementById("user").innerText,getPub);
	}
	
	return {
		getPublicaciones: getPublicaciones
	};
	
})();