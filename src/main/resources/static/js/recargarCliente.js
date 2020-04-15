var recargarCliente =(function(){
	
	return {
		recarga: function(id,monto) {
			$.ajax({
				url: "usuario/"+id+"/setSaldo/"+monto,
				type: "PUT",
				success: function () {
					if (monto > 0) {
						var texto = "Recarga exitosa por: " + monto;
						recargar.notify('notifyOk',".myAlert-top",texto);
					}
					else {
					}
				},
				async: true
			});
		}
	};
	
})();