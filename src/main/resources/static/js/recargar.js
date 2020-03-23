var recargar =(function(){
	
	function recarga() {
		var recarga = $('#recarga').val();
		if (recarga<1){
			alert("Su recarga tiene que ser mayor a 0");
		} else {
			recargarCliente.recarga(document.getElementById("user").innerText,recarga);
		}
	}
	
	return {
		recarga: recarga
	};
	
})();