var articulo =(function(){
	var _id = 0;
	var lista = [];
	var lista2 = [];
	var ultimaOferta = 0;
	var cantidadAPujar = 0;
	var saldoUsuario = 0;

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
		saldoUsuario = document.getElementById('saldo').innerText;
		if (saldoUsuario >= cantidadAPujar) {
			if (cantidadAPujar > ultimaOferta) {
				if (cantidadAPujar < (ultimaOferta * 1.05)) {
					alert("Debe pujar al menos " + (ultimaOferta * 1.05));
				} else {
					lista = { valorOfrecido: cantidadAPujar, valorOfertaAutomatica: cantidadAPujar, ofertaAutomatica: false, usuario: document.getElementById('user').innerText };
					//alert("oferta aceptada por: " + _id);
					articuloCliente.saveOferta(lista, changeState, cantidadAPujar);
					alert("Oferta aceptada por: " + cantidadAPujar);

					recargarCliente.recarga(document.getElementById('user').innerText, -(cantidadAPujar));
				}
			}
			else {
				alert("El monto a pujar debe ser mayor al de la ultima oferta");
			}
		}
		else {
			alert("No tiene saldo suficiente, recargue mas fondos");
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
			$("#fecha_de_subasta").html("Subastado el: "+art.fechadeSubasta);			
			if (art.usado){
				$("#usado").html("Usado");
			} else {$("#usado").html("Nuevo");}
			$("#estado").html(art.estado);
			articuloCliente.getCliente(art.oferta);
			$("#categoria").html(art.categoria);
			$("#usuario").html("Publicado por: "+art.usuario);
			$("#nombre").html(art.nombre);
			$("#ubicacion").html(art.ubicacion);
			$("#marca").html(art.marca);
			$("#imagen").html(art.imagen);
			setImg();
	}
	
	function addToFavorite() {
		alert(document.getElementById('user').innerText == document.getElementById('usuario').innerText);
		alert(document.getElementById('user') == document.getElementById('usuario'));
		if (document.getElementById('user').innerText == document.getElementById('usuario').innerText){
			alert("No puede añadir a favoritos un artículo que publicó");
		} else {
			articuloCliente.addToFavorite(document.getElementById('user').innerText,_id);
		}
		
	}
	
	
	function setImg() {
		fetch(document.getElementById('imagen').innerText)
		  .then(res => res.blob()) // Gets the response and returns it as a blob
		  .then(blob => {
			// Here's where you get access to the blob
			// And you can use it for whatever you want
			// Like calling ref().put(blob)

			// Here, I use it to make an image appear on the page
			const width = 299;
			const height = 299;
			let objectURL = URL.createObjectURL(blob);
			let myImage = new Image();
			myImage.src = objectURL;
			const elem = document.getElementById('myImg').appendChild(myImage)
			elem.width = width;
			elem.height = height;
		});
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