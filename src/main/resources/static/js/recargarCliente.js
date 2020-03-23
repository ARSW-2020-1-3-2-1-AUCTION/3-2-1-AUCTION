var recargarCliente =(function(){
	
	return {
		recarga: function(id,monto) {
			$.ajax({
				url: "usuario/"+id+"/setSaldo/"+monto,
				type: "PUT",
				success: function () {
					alert("Recarga exitosa de: "+monto);
				},
				async: true
			});
		}
	};
	
})();