var recargarCliente =(function(){
	
	return {
		recarga: function (id, monto) {
			$.ajax({
				url: "usuario/"+id+"/setSaldo/"+monto,
				success: function (result) {
				},
				async: true
			});
		},
		recargaDirecta: function (id, monto) {
			$.ajax({
				url: "usuario/"+id+"/setSaldo/"+monto,
				success: function (result) {
					if (monto > 0) {
						$("#saldo").html(parseInt(result,10));
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