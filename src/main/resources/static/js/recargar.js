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
	
	return {
		recarga: recarga,
		notify: notify
	};
	
})();