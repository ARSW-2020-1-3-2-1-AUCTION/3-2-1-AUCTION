var categorias =(function(){
	var lista = [];
	var num = 0;
	var id = "";
	var logeado = false;
	var saldo = 0;
	
	function getCat(retorno) {
		$("#categoriaTable div").remove();
		var i = 0;
		retorno.map(function(cat){
			categoriasCliente.numArtPorCat(getArtXCat,cat.id,i);			
			var fila = "<div class=\"grid-1-5\"><h4><b>"+cat.nombre+"</b></h4><h4 id=\"categ"+i+"\">"+num+"</h4><img width='265' height='180' src=\"img/cat"+i+".jpg\"><a href=\"articulos.html?var1="+cat.nombre+"&var2="+cat.id+"&user="+document.getElementById("user").innerText+"\" class=\"button\">Ir</a></div>";
			$("#categoriaTable").append(fila);			
			i+=1;
		})
	}
	
	
	function getArtXCat(numero,i) {
		var j = 0;
		numero.map(function(num){
            j+=1;
        })
		$( "#categ"+i ).html(j+" Artículos");
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
			var re = document.getElementById("re").href+"?user="+document.getElementById("user").innerText;
			document.getElementById("re").href = re;
		}
		
	function logOut() {
		setLogeado(false);
		categoriasCliente.deleteUserCache(document.getElementById("user").innerText);
	}
	
	var setLogeado = function (result) {
        logeado = result;
		if (logeado){
			categoriasCliente.getSaldo(document.getElementById("user").innerText,setSaldo);
		}
		else {
			saldo = 0;
			$( "#saldo" ).html(saldo);
		}
    }
	
	var setSaldo = function (result) {
		saldo = result;
		$("#saldo").html(saldo);
	}
	
	function existUsername() {
		categoriasCliente.existUsername(document.getElementById("user").innerText,setLogeado);
	}
	
	function estaLog(ruta) {
		if(logeado){
			location.href = ruta+"?user="+document.getElementById("user").innerText;
		} else{
			location.href = "/login.html";
		}
	}
	
	function notify (tipo,alerta,mensaje){
		document.getElementById(tipo).innerHTML = mensaje;
		$(alerta).show();
		setTimeout(function(){
			$(alerta).hide();
		}, 5000);
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
		existUsername: existUsername,
		estaLog: estaLog,
		notify: notify
	};
	
	
})();