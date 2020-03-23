articuloCliente = (function() {
	return {
		saveOferta: function (Oferta) {
            $.ajax({
                url: "/oferta",
                type: "POST",
                data: JSON.stringify(Oferta),
                contentType: "application/json",
                success: function () {
					alert("Puja realizada satisfactoriamnete");
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    alert("Error al realizar la puja" + textStatus + " " + errorThrown);
                }   
            });
		},

        changeState: function (Publicacion) {

            $.ajax({
                url: "publicacion/getById" + Publicacion.id,
                type: "PUT",
                data: JSON.stringify(Publicacion),
                contentType: "application/json",
                success: function () {
                    location.href = "/articulo.html";

                }
            })
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