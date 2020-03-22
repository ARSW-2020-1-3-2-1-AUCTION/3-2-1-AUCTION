articuloCliente = (function() {
	return {
            saveOferta: function (Oferta) {

                $.ajax({
                    url: "/oferta",
                    type: "POST",
                    data: JSON.stringify(oferta),
                    contentType: "application/json",
                    success: function () {

                        location.href = "/articulo.html";
                    },
                    error: function (XMLHttpRequest, textStatus, errorThrown) {
                        alert("Error al realizar la puja" + textStatus + " " + errorThrown);
                    }   
                });
            },

		getArticulo: function(callback,articuloId) {
			$.ajax({
				url: "publicacion/getById/"+articuloId,
				success: function (result) {
					callback(result);
				},
				async: true
			});
		}
	};

})();