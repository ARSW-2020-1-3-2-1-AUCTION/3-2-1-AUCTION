var articulos =(function(){
	var cate = "";
	var idCate = 2;
	var lista = [];
	
	function getUrlVars() {
		var vars = {};
		var parts = window.location.href.replace(/[?&]+([^=&]+)=([^&]*)/gi, function(m,key,value) {
			vars[key] = value;
		});
		return vars;
	}
	
	var setName = function (name) {
        cate = name;
        $( "#articulo" ).html(cate);
    }
	
	var setId = function (id) {
        idCate = id;
    }
	
	function getArt(retorno) {
		$("#articuloTable div").remove();
		var i = 0;
		retorno.map(function(art){
			var fila = "<div class=\"grid-1-5\"><h2>Valor: "+art.valor+"</h2><a href=\"articulo.html?var1="+art.id+"\" class=\"button\">"+art.nombre+"</a></div>";
            $("#articuloTable").append(fila);
			i+=1;
		})
	}
	
	return {
		setCate: function(){
			var cate = getUrlVars()["var1"];
			setName(cate);
			var idCate = getUrlVars()["var2"];
			setId(idCate);
		},
		getArticulos: function(){
			articulosCliente.getArticulos(getArt,idCate);
		}
	};
	
})();