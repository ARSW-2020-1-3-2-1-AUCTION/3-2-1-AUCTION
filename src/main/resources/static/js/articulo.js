var articulo =(function(){
	var _id = 0;
	var lista = [];
	var lista2 = [];
	var ultimaOferta = 0;
	var cantidadAPujar = 0;

	function getUrlVars() {
		var vars = {};
		var parts = window.location.href.replace(/[?&]+([^=&]+)=([^&]*)/gi, function(m,key,value) {
			vars[key] = value;
		});
		return vars;
	}

	
	function addOferta() {
		ultimaOferta = document.getElementById('valor').innerText;
		cantidadAPujar = $('#puja').val();
		
		if (cantidadAPujar > ultimaOferta) {
			if (cantidadAPujar <  (ultimaOferta * 1.05)) {
				alert("Debe pujar al menos " + (ultimaOferta * 1.05) );
			} else {
				lista = { valorOfrecido: cantidadAPujar, valorOfertaAutomatica: cantidadAPujar, ofertaAutomatica: false, usuario: document.getElementById('user').innerText };
				//alert("oferta aceptada por: " + _id);
				articuloCliente.saveOferta(lista,changeState,cantidadAPujar);
				alert("oferta aceptada por: "+cantidadAPujar);
				}
			}
		else {
			alert("El monto a pujar debe ser mayor al de la ultima Oferta");
		}
	}
	
	function changeState(result,valorOfrecido) {
		articuloCliente.changeState(result,valorOfrecido,_id);
	}
	
	var setId = function (id) {
        _id = id;
    }
	
	function setInformacion(art) {
			$("#descripcion").html(art.descripcion);
			$("#valor").html(art.valor);
			$("#fecha_publicacion").html(art.fechaPublicacion);
			$("#fecha_de_subasta").html(art.fechadeSubasta);			
			if (art.usado){
				$("#usado").html("Usado");
			} else {$("#usado").html("Nuevo");}
			$("#estado").html(art.estado);
			$("#oferta").html(art.oferta);
			$("#categoria").html(art.categoria);
			$("#usuario").html(art.usuario);
			$("#nombre").html(art.nombre);
			$("#ubicacion").html(art.ubicacion);
			$("#marca").html(art.marca);
	}
	
	function addToFavorite() {
		articuloCliente.addToFavorite(document.getElementById('user').innerText,_id);
	}
	
	
	return {
		addOferta: addOferta,
		setUser: function (){
			$( "#user" ).html(getUrlVars()["user"]);
		},
		setID: function(){
			var id = getUrlVars()["var1"];
			setId(id);
		},
		setInfo: function(){
			articuloCliente.getArticulo(setInformacion,_id);
		},
		addToFavorite: addToFavorite
	};
})();