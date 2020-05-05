var publicar1 =(function(){
	var lista = [];
	var nombre = "";
	var ubicacion = "";
	var categoria = "";
	var marca = "";
	var usado = "";
	var calendario = "";
	var descripcion = "";
	var imagen = "";
	var valor = 0;
	var usuario = "";
	var imagen = "";
	var tiempo = "";
	
	function setValues() {
		nombre = document.getElementById("nombre").value;
		ubicacion = document.getElementById("ubicacion").value;
		categoria = document.getElementById("categoria").value;
		marca = document.getElementById("marca").value;
		usado = document.getElementById("usado").value;
		calendario = document.getElementById("calendario").value;
		descripcion = document.getElementById("descripcion").value;
		valor = document.getElementById("valor").value;
		usuario = document.getElementById("user").innerText;
		imagen = document.getElementById("imagen").value;
		tiempo = document.getElementById("tiempo").value;

		if (nombre == "" || ubicacion == "" || categoria == "" || marca == "" || usado == "" || calendario == "" || descripcion == "" || usuario == "" || tiempo == "") {
			notify ('notifyNoOk',".myAlert-top2","Para publicar ningún campo puede ser vacío");
		} else {
			lista = {
				nombre: nombre, ubicacion: ubicacion, categoria: categoria, marca: marca, usado: usado, fechadeSubasta: calendario, descripcion: descripcion, valor: valor, usuario: usuario, imagen: imagen, tiempo: tiempo
			};
			publicar1Cliente.putArticulo(JSON.stringify(lista));
			notify ('notifyOk',".myAlert-top","Publicación exitosa, ahora puede ver su producto");
			location.href = "/publicaciones.html?user=" + sessionStorage.getItem('currentUser');
		}		
	}
	
	function setCalendario() {
		document.getElementById("calendario").datetimepicker();
	}
	
	function notify (tipo,alerta,mensaje){
		document.getElementById(tipo).innerHTML = mensaje;
		$(alerta).show();
		setTimeout(function(){
			$(alerta).hide();
		}, 5000);
	}
	
	var connectAndSubscribe = function () {
        console.info('Connecting to WS...');
        var socket = new SockJS('/stompendpoint');
        stompClient = Stomp.over(socket);
        
        //subscribe to /articulo when connections succeed
        stompClient.connect({}, function (frame) {
            console.log('Connected: ' + frame);
            stompClient.subscribe('/articulo', function (eventbody) {
                var theObject = JSON.parse(eventbody.body);
				if (theObject.UserADevolverSaldo == document.getElementById('user').innerText) {
					$("#saldo").html(parseInt(theObject.valorADevolver,10) + parseInt(document.getElementById('saldo').innerText,10));
				}
				if ("Publicado por: "+document.getElementById('user').innerText == theObject.publicadoPor){
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
		connectAndSubscribe: connectAndSubscribe,
		setValues: setValues,
		setCalendario: setCalendario
	};
	
})();