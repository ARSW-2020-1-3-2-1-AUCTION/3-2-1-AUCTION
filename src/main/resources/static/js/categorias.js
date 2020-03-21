var categorias =(function(){
	var lista = [];
	var num = 0;
	var id = "";
	
	function getCat(retorno) {
		$("#categoriaTable div").remove();
		var lista  = retorno.map(function(cat){
            return {key:cat.id, value:cat.nombre}
        })
		var i = 0;
		lista.map(function(cat){
			categoriasCliente.numArtPorCat(getArtXCat,cat.key,i);
			var fila = "<div class=\"grid-1-5\"><h2 id=\"categ"+i+"\">"+num+"</h2><a href=\"articulos.html?var1="+cat.value+"&var2="+cat.key+"&user="+document.getElementById("user").innerText+"\" class=\"button\">"+cat.value+"</a></div>";
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
	
	function getUrlVars() {
		var vars = {};
		var parts = window.location.href.replace(/[?&]+([^=&]+)=([^&]*)/gi, function(m,key,value) {
			vars[key] = value;
		});
		return vars;
	}
	
	function setHref() {
			var c = document.getElementById("c").href+"?user="+document.getElementById("user").innerText;
			document.getElementById("c").href = c;
			var f = document.getElementById("f").href+"?user="+document.getElementById("user").innerText;
			document.getElementById("f").href = f;
			var p = document.getElementById("p").href+"?user="+document.getElementById("user").innerText;
			document.getElementById("p").href = p;
			var mp = document.getElementById("mp").href+"?user="+document.getElementById("user").innerText;
			document.getElementById("mp").href = mp;
			var pec = document.getElementById("pec").href+"?user="+document.getElementById("user").innerText;
			document.getElementById("pec").href = pec;
		}
		
	function logOut() {
		categoriasCliente.deleteUserCache(document.getElementById("user").innerText);
	}
	
	function existUsername() {
		categoriasCliente.existUsername(document.getElementById("user").innerText);
	}
	
	return {
		setUser: function (){
			$( "#user" ).html(getUrlVars()["user"]);
		},
		getCategorias: function(){
			categoriasCliente.getCategorias(getCat);
		},
		setHref: setHref, 
		logOut: logOut,
		existUsername: existUsername
	};
	
	
})();