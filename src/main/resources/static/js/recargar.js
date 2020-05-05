var recargar =(function(){
	
	function recarga() {
		var recarga = $('#recarga').val();
		if (recarga<1){
			notify ('notifyNoOk',".myAlert-top2","Su recarga tiene que ser mayor a 0");
		} else {
			recargarCliente.recargaDirecta(document.getElementById("user").innerText,recarga);
		}
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
		recarga: recarga,
		notify: notify
	};
	
})();