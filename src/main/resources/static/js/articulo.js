var articulo =(function(){
	var _id = 0;



	function getUrlVars() {
		var vars = {};
		var parts = window.location.href.replace(/[?&]+([^=&]+)=([^&]*)/gi, function(m,key,value) {
			vars[key] = value;
		});
		return vars;
	}



	var addOferta = function (Oferta) {
		var ultimaOferta = document.getElementById('oferta').innerHTML;

		var cantidadAPujar = $('#cantidad').val();
		if (cantidadAPujar > uiltimaOferta) {
			if (cantidadAPujar < uiltimaOferta + ultimaOferta * 0.05) {
				alert("Debe pujar al menos " + uiltimaOferta + ultimaOferta * 0.05 );

			}
			
			else {
					articuloCliente.saveOferta(cantidadAPujar);
				}
				alert(cantidadAPujar + " aceptada");

			}

		
		else {
			alert("El monto que quiere ingresar es menor al de la ultima Oferta");
		}

	}
	
	var setId = function (id) {
        _id = id;
    }
	
	function setInformacion(art) {
			$("#descripcion").html(art.descripcion);
			$("#valor").html(art.valor);
			$("#fecha_de_subasta").html(art.fecha_de_subasta);
			$("#usado").html(art.usado);
			$("#estado").html(art.estado);
			$("#oferta").html(art.oferta);
			$("#categoria").html(art.categoria);
			$("#usuario").html(art.usuario);
			$("#nombre").html(art.nombre);
			$("#ubicacion").html(art.ubicacion);
			$("#marca").html(art.marca);
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
		}
	};
})();