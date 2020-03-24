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
				lista2 = { descripcion: document.getElementById('descripcion').innerText, valor: cantidadAPujar, fechaPublicacion: document.getElementById('fecha_publicacion').value, fechadeSubasta: document.getElementById('fecha_de_subasta').value, usado: document.getElementById('usado').innerText, estado: document.getElementById('estado').innerText, oferta: document.getElementById('oferta').innerText, categoria: document.getElementById('categoria').innerText, usuario: document.getElementById('usuario').innerText, nombre: document.getElementById('nombre').innerText, ubicacion: document.getElementById('ubicacion').innerText, marca: document.getElementById('marca').innerText};
				articuloCliente.saveOferta(lista);
				
				articuloCliente.changeState(lista2);
				alert("oferta aceptada por: "+cantidadAPujar);
				}
			}
		else {
			alert("El monto a pujar debe ser mayor al de la ultima Oferta");
		}
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