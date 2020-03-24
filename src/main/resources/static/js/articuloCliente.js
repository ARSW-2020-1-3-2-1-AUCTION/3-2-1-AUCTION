articuloCliente = (function() {
	return {
		saveOferta: function (Oferta) {
            $.ajax({
                url: "/oferta",
                type: "POST",
                data: JSON.stringify(Oferta),
                contentType: "application/json",
                success: function () {
					alert("devuelve OK");
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
		},
		addToFavorite: function(usuario,publicacion) {
			$.ajax({
				url: "/preferencia/"+usuario+"/"+publicacion,
				type: "GET",
				data: JSON.stringify(usuario),
				contentType: "application/json",
				success: function () {
					alert("Añadido a favoritos con éxito");
				},
				async: true
			});
		}
	};

})();