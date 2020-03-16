var categorias =(function(){
	var lista = [];
	var numArt = 0;
	
	function getCat(retorno) {
		$("#categoriaTable div").remove();
		var lista  = retorno.map(function(cat){
            return {key:cat.id, value:cat.nombre}
        })
		var i = 0;
		lista.map(function(cat){
			categoriasCliente.numArtPorCat(getArtXCat,cat.key);
			console.log("global: "+numArt);
			var fila = "<div class=\"grid-1-5\"><h2>"+numArt+"</h2><a href=\"articulos.html?var1="+cat.value+"\" class=\"button\">"+cat.value+"</a></div>";
			//<td><button type=\"button\" class=\"btn btn-success\" onclick=\"app.draw("+i+")\">Open</button></td>
			//var fila = "<tr><td id=\"bpName"+i+"\">" + BP.key + "</td><td id='point'>"+BP.value+"</td><td><button type=\"button\" class=\"btn btn-success\" onclick=\"app.draw("+i+")\">Open</button></td></tr>";

            $("#categoriaTable").append(fila);
			i+=1;
		})
	}
	
	function getArtXCat(numero) {
		var i = 0;
		numero.map(function(num){
            i+=1;
        })
		numArt = i;
		console.log("en metodo: "+numArt);
	}
	
	return {
		getCategorias: function(){
			categoriasCliente.getCategorias(getCat);
		}
	};
	
	
})();