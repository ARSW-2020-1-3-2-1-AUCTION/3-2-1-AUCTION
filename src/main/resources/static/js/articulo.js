var articulo =(function(){
	var _id = 0;
	var lista = [];
	var lista2 = [];
	var ultimaOferta = 0;
	var cantidadAPujar = 0;
	var saldoUsuario = 0;
	var usuarioConPuja = "";
	
	function setPermitido(result,ultimaOferta,cantidadAPujar,saldoUsuario,respuesta) {
		if (result){
			lista = { valorOfrecido: cantidadAPujar, valorOfertaAutomatica: cantidadAPujar, ofertaAutomatica: false, usuario: document.getElementById('user').innerText };
			articuloCliente.saveOferta(lista, changeState, cantidadAPujar,respuesta,ultimaOferta);

			var texto = "Oferta aceptada por: " + cantidadAPujar + ". Se descontó de su saldo.";
			notify('notifyOk', ".myAlert-top", texto);
									
			recargarCliente.recarga(document.getElementById('user').innerText, -(cantidadAPujar));
			recargarCliente.recarga(respuesta, ultimaOferta);
			$("#saldo").html(saldoUsuario - cantidadAPujar);
		}
		else {
			notify('notifyNoOk', ".myAlert-top2", "Alguien subió la apuesta antes que usted");
		}
	}

	function getUrlVars() {
		var vars = {};
		var parts = window.location.href.replace(/[?&]+([^=&]+)=([^&]*)/gi, function(m,key,value) {
			vars[key] = value;
		});
		return vars;
	}

	function setInformacion(art,state) {
		$("#descripcion").html(art.descripcion);
		$("#valor").html(art.valor);
		$("#fecha_publicacion").html(art.fechaPublicacion);
		$("#fecha_de_subasta").html("Subastado el: " + art.fechadeSubasta);
		if (art.usado) {
			$("#usado").html("Usado");
		} else { $("#usado").html("Nuevo"); }
		articuloCliente.getCliente(art.oferta);
		$("#tiempo").html(art.tiempo);
		$("#categoria").html(art.categoria);
		$("#usuario").html("Publicado por: " + art.usuario);
		$("#nombre").html(art.nombre);
		$("#ubicacion").html(art.ubicacion);
		$("#marca").html(art.marca);
		$("#imagen").html(art.imagen);
		if (state == "si"){
			setImg();
		}
		
		var fecha = art.fechadeSubasta.charAt(0) + art.fechadeSubasta.charAt(1) + art.fechadeSubasta.charAt(2) + art.fechadeSubasta.charAt(3) + "-" + art.fechadeSubasta.charAt(5) + art.fechadeSubasta.charAt(6) + "-" + art.fechadeSubasta.charAt(8) + art.fechadeSubasta.charAt(9) + "T" + art.fechadeSubasta.charAt(11) + art.fechadeSubasta.charAt(12) + ":" + art.fechadeSubasta.charAt(14) + art.fechadeSubasta.charAt(15);
		fecha = new Date(fecha);
		countdown(fecha, 'clock');
	}

	
	function addOferta() {
		ultimaOferta = parseInt(document.getElementById('valor').innerText,10);
		cantidadAPujar = $('#puja').val();
		usuarioConPuja = document.getElementById('oferta').innerText;
		var respuesta = "";
		contador = 0;
		while (usuarioConPuja[contador] != " " || usuarioConPuja[contador + 6] != " " || usuarioConPuja[contador + 11] != " " || usuarioConPuja[contador + 12] != "p") {
			respuesta = respuesta + usuarioConPuja[contador]
			contador++;
		}
		saldoUsuario = parseInt(document.getElementById('saldo').innerText,10);
		if ("Publicado por: "+document.getElementById('user').innerText == document.getElementById('usuario').innerText){
			notify ('notifyNoOk',".myAlert-top2","No puede ofertar por un artículo que usted publicó");
		} else {
			if (document.getElementById('clock').innerText.charAt(12) == "c") {
				if (saldoUsuario >= cantidadAPujar) {
					if (cantidadAPujar > ultimaOferta) {
						if (document.getElementById('user').innerText != respuesta) {
							if (cantidadAPujar < (Math.floor(ultimaOferta * 1.05))) {
								var texto = "Debe pujar al menos " + Math.floor(ultimaOferta * 1.05);
								notify('notifyNoOk', ".myAlert-top2", texto);
							}
							else {
								articuloCliente.permitida(_id,ultimaOferta,cantidadAPujar,saldoUsuario,setPermitido,respuesta);
							}
						}
						else {
							notify('notifyNoOk', ".myAlert-top2", "Usted posee el producto, no puede pujar de nuevo");
						}
					}
					else {
						notify ('notifyNoOk',".myAlert-top2","El monto a pujar debe ser mayor al de la última oferta");
					}
				}
				else {
					notify ('notifyNoOk',".myAlert-top2","No tiene saldo suficiente, recargue más fondos");
				}
			} else {
				notify ('notifyNoOk',".myAlert-top2","Este artículo no se está subastando actualmente");
			}
		}
	}
	
	function addOfertaAutomatica() {
		ultimaOferta = parseInt(document.getElementById('valor').innerText,10);
		cantidadAPujar = Math.floor(ultimaOferta * 1.05);
		usuarioConPuja = document.getElementById('oferta').innerText;
		var respuesta = "";
		contador = 0;
		while (usuarioConPuja[contador] != " " || usuarioConPuja[contador + 6] != " " || usuarioConPuja[contador + 11] != " " || usuarioConPuja[contador + 12] != "p") {
			respuesta = respuesta + usuarioConPuja[contador]
			contador++;
		}
		saldoUsuario = parseInt(document.getElementById('saldo').innerText,10);
		if (document.getElementById('clock').innerText.charAt(12) == "c") {
			if (saldoUsuario >= cantidadAPujar) {
				articuloCliente.permitida(_id,ultimaOferta,cantidadAPujar,saldoUsuario,setPermitido,respuesta);
			}
			else {
				notify ('notifyNoOk',".myAlert-top2","No tiene saldo suficiente, recargue más fondos");
			}
		} else {
			notify ('notifyNoOk',".myAlert-top2","Este artículo no se está subastando actualmente");
		}
	}
	
	function notify (tipo,alerta,mensaje){
		document.getElementById(tipo).innerHTML = mensaje;
		$(alerta).show();
		setTimeout(function(){
			$(alerta).hide();
		}, 10000);
	}
	
	function changeState(result,valorOfrecido,respuesta,ultimaOferta) {
		var usuario = document.getElementById('user').innerText;
		var nombreArt = document.getElementById('nombre').innerText;
		articuloCliente.changeState(result,valorOfrecido,_id,usuario,nombreArt,respuesta,ultimaOferta);
	}
	
	var setId = function (id) {
        _id = id;
    }
	

	
	function addToFavorite() {
		if ("Publicado por: "+document.getElementById('user').innerText == document.getElementById('usuario').innerText){
			notify ('notifyNoOk',".myAlert-top2","No puede añadir a favoritos un artículo que usted publicó");
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
			const elem = document.getElementById('myImg').appendChild(myImage);
			while (elem.hasChildNodes()) {  
				elem.removeChild(elem.firstChild);
				alert("removio");
			}
			elem.width = width;
			elem.height = height;
		});
	}
	
	const getTime = deadline => {
		let now = new Date(),
			faltante = ((deadline - now + 1000) / 1000),
			
			adicional = faltante + parseInt(document.getElementById('tiempo').innerText,10) * 60,
			segundos = ('0' + Math.floor(faltante % 60)).slice(-2),
			minutos = ('0' + Math.floor(faltante / 60 % 60)).slice(-2),
			horas = ('0' + Math.floor(faltante / 3600 % 24)).slice(-2),
			dias = Math.floor(faltante / (3600 * 24)),
			horasAd = ('0' + Math.floor(adicional / 60 / 60 % 60)).slice(-2),
			segundosAd = ('0' + Math.floor(adicional % 60)).slice(-2),
			minutosAd = ('0' + Math.floor(adicional / 60 % 60)).slice(-2);
			
			return {
				faltante,
				segundos,
				minutos,
				horas,
				dias,
				adicional,
				minutosAd,
				segundosAd,
				horasAd
			}
	};
	
	const countdown = (deadline, elem) => {
		const el = document.getElementById(elem);
		var primeraVez = true;
		
		const timerUpdate = setInterval( () => {
			let t = getTime(deadline);
			if (t.faltante > 1){
				el.innerHTML = "Tiempo para iniciar subasta: "+`${t.dias} Día(s) ${t.horas}h:${t.minutos}m:${t.segundos}s`;
			} else if (t.adicional > 0) {
				el.innerHTML = "Tiempo para cerrar la subasta: " + `${t.horasAd}h:${t.minutosAd}m:${t.segundosAd}s`;
				if (primeraVez){
					articuloCliente.setPujaEnCurso(parseInt(_id,10));
					primeraVez = false;
				}
			}
			else {
				el.innerHTML = "Subasta finalizada"
				articuloCliente.deletePujaEnCurso(parseInt(_id,10));
				clearInterval(timerUpdate);
			}
		}, 1000)
	}
	
	var connectAndSubscribe = function () {
        console.info('Connecting to WS...');
        var socket = new SockJS('/stompendpoint');
        stompClient = Stomp.over(socket);
        
        //subscribe to /articulo/id when connections succeed
        stompClient.connect({}, function (frame) {
            console.log('Connected: ' + frame);
            stompClient.subscribe('/articulo/'+_id, function (eventbody) {
                var theObject = JSON.parse(eventbody.body);
				if (theObject.UserADevolverSaldo == document.getElementById('user').innerText) {
					$("#saldo").html(parseInt(theObject.valorADevolver,10) + parseInt(document.getElementById('saldo').innerText,10));
				}
				if ("Publicado por: "+document.getElementById('user').innerText == document.getElementById('usuario').innerText){
					var texto = "Ofertaron "+theObject.valor+" por "+theObject.nombreArt+". ¿Desea publicar similar?";
					notify ('notify',".myAlert-top3",texto);
				} else if (theObject.usuario != document.getElementById('user').innerText) {
					var texto = theObject.usuario+" ofertó "+theObject.valor+" por "+theObject.nombreArt+". ¿Desea ofertar "+Math.floor(parseInt(theObject.valor,10)*1.05)+"?  "+'<button class="otherbutton" id="similar" onclick="articulo.addOfertaAutomatica()">Superar Oferta</button>' ;
					notify ('notify',".myAlert-top3",texto);
				}
				articulo.setInfo('no');
			});
        });

    };
	
	
	return {
		addOferta: addOferta,
		addOfertaAutomatica: addOfertaAutomatica,
		setUser: function (){
			$( "#user" ).html(getUrlVars()["user"]);
		},
		setID: function(){
			var id = getUrlVars()["var1"];
			setId(id);
		},
		setInfo: function(state){
			articuloCliente.getArticulo(setInformacion,_id,state);
		},
		addToFavorite: addToFavorite,
		connectAndSubscribe: connectAndSubscribe,
		notify: notify
	};
})();