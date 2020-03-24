var recargarCliente =(function(){
	
	return {
		recarga: function(id,monto) {
			$.ajax({
				url: "usuario/"+id+"/setSaldo/"+monto,
				type: "PUT",
				success: function () {
					if (monto > 0) {
						alert("Recarga exitosa de: " + monto);
					}
					else {
						alert("Se desconto de su cuenta el valor de: " + monto);
					}
				},
				async: true
			});
		}
	};
	
})();