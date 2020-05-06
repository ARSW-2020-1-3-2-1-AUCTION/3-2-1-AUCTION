var pujasEnCurso =(function(){
	
	var lista = [];
	var i = 0;
	
	function getEnCurso(EnCurso,i) {
		var fila = "<div class=\"grid-1-5\"><h4><b>"+EnCurso.nombre+"</b></h4><h4>Valor: "+EnCurso.valor+"</h4><div id=\"ima"+i+"\"  class='imagen2'></div><a href=\"articulo.html?var1="+EnCurso.id+"&user="+document.getElementById("user").innerText+"\" class=\"button\">Ir</a></div>";
        $("#pujasEnCursoTable").append(fila);
		se(EnCurso,i);
	}
	
	function se(fav,i) {
		fetch(fav.imagen)
			.then(res => res.blob()) // Gets the response and returns it as a blob
			.then(blob => {
				// Here's where you get access to the blob
				// And you can use it for whatever you want
				// Like calling ref().put(blob)

			// Here, I use it to make an image appear on the page
				const width = 265;
				const height = 180;
				let objectURL = URL.createObjectURL(blob);
				let myImage = new Image();
				myImage.src = objectURL;
				const elem = document.getElementById('ima'+i).appendChild(myImage)
				elem.width = width;
				elem.height = height;
				
			});
	}
	
	function anadirPujasEnCurso(retorno) {
		$("#pujasEnCursoTable div").remove();
		i = 0;
		retorno.map(function(enCurso){
			getEnCurso(enCurso,i);
			i+=1;
        })
	}
	
	function getPujasEnCurso() {
		pujasEnCursoCliente.getPujasEnCurso(anadirPujasEnCurso);
	}
	
	function notify (tipo,alerta,mensaje){
		document.getElementById(tipo).innerHTML = mensaje;
		$(alerta).show();
		setTimeout(function(){
			$(alerta).hide();
		}, 10000);
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
					var texto = "Ofertaron "+theObject.valor+" por "+theObject.nombreArt+". ¿Desea publicar similar?  "+'<button class="otherbutton" id="simi" onclick="articuloCliente.addSimilar('+theObject.id+')">Publicar Similar</button>';
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
		getPujasEnCurso: getPujasEnCurso
	};
})();