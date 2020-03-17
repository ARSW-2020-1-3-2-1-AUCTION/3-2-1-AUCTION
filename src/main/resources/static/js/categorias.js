var categorias =(function(){
	var lista = [];
	var num = 0;
	
	function getCat(retorno) {
		$("#categoriaTable div").remove();
		var lista  = retorno.map(function(cat){
            return {key:cat.id, value:cat.nombre}
        })
		var i = 0;
		lista.map(function(cat){
			categoriasCliente.numArtPorCat(getArtXCat,cat.key,i);
			var fila = "<div class=\"grid-1-5\"><h2 id=\"categ"+i+"\">"+num+"</h2><a href=\"articulos.html?var1="+cat.value+"&var2="+cat.key+"\" class=\"button\">"+cat.value+"</a></div>";
			//<td><button type=\"button\" class=\"btn btn-success\" onclick=\"app.draw("+i+")\">Open</button></td>
			//var fila = "<tr><td id=\"bpName"+i+"\">" + BP.key + "</td><td id='point'>"+BP.value+"</td><td><button type=\"button\" class=\"btn btn-success\" onclick=\"app.draw("+i+")\">Open</button></td></tr>";

            $("#categoriaTable").append(fila);
			i+=1;
		})
	}
	
	function getArtXCat(numero,i) {
		var j = 0;
		numero.map(function(num){
            j+=1;
        })
		$( "#categ"+i ).html("Cantidad de artículos: "+j);
	}
	
	return {
		getCategorias: function(){
			categoriasCliente.getCategorias(getCat);
		}
	};
	
	
})();