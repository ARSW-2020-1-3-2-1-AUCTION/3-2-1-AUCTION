categoriasCliente = (function() {
	return {
		getCategorias: function(callback) {
			$.ajax({
				url: "categoria",
				success: function (result) {
					callback(result);
				},
				async: true
			});
		},
		numArtPorCat: function(callback,categoriaId,i) {
			$.ajax({
				url: "publicacion/ByCategoria/"+categoriaId,
				success: function (result) {
					callback(result,i);
				},
				async: true
			});
		}
	};
})();