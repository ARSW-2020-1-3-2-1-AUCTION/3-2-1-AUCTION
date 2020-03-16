var categorias =(function(){
	var lista = [];
	var numArtPorCat = 0:
	
	function getCat(retorno) {
		$("#categoriaTable div").remove();
		var lista  = retorno.map(function(cat){
            return {key:cat.id, value:cat.nombre}
        })
		var i = 0;
		lista.map(function(cat){
			categoriasCliente.numArtPorCat(getArtXCat);
			var fila = "<div class=\"grid-1-5\"><h2>"+numArtPorCat+"</h2><a href=\"articulos.html?var1="+cat.value+"\" class=\"button\">"+cat.value+"</a></div>";
			//<td><button type=\"button\" class=\"btn btn-success\" onclick=\"app.draw("+i+")\">Open</button></td>
			//var fila = "<tr><td id=\"bpName"+i+"\">" + BP.key + "</td><td id='point'>"+BP.value+"</td><td><button type=\"button\" class=\"btn btn-success\" onclick=\"app.draw("+i+")\">Open</button></td></tr>";

            $("#categoriaTable").append(fila);
			i+=1;
		})
	}
	
	function getArtXCat(numero) {
		vai i = 0;
		numero.map(function(num){
            i+=1;
        })
		var numArtPorCat  = i;
	}
	
	return {
		getCategorias: function(){
			var fila = "<div class=\"grid-1-5\"><a href=\"articulos.html?var1=librosss\" class=\"button\">"+"librosss"+"</a></div>";
			$("#categoriaTable").append(fila);
			var fila = "<div class=\"grid-1-5\"><a href=\"articulos.html?var1=carrosss\" class=\"button\">"+"carrosss"+"</a></div>";
			$("#categoriaTable").append(fila);
			var fila = "<div class=\"grid-1-5\"><a href=\"articulos.html?var1=pesasss\" class=\"button\">"+"pesasss"+"</a></div>";
			$("#categoriaTable").append(fila);
			var fila = "<div class=\"grid-1-5\"><a href=\"articulos.html?var1=VideoJuegos\" class=\"button\">"+"VideoJuegos"+"</a></div>";
			$("#categoriaTable").append(fila);
			//categoriasCliente.getCategorias(getCat);
		}
	};
	
	
})();