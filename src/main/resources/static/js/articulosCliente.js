articulosCliente = (function() {
	return {
		getArticulos: function(callback,articuloId) {
			$.ajax({
				url: "publicacion/ByCategoria/"+articuloId,
				success: function (result) {
					callback(result);
				},
				async: true
			});
		}
	};
})();