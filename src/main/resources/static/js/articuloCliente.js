articuloCliente = (function() {
	return {
		saveOferta: function (Oferta,callback,valorOfrecido) {
            $.ajax({
                url: "/oferta",
                type: "POST",
                data: JSON.stringify(Oferta),
                contentType: "application/json",
                success: function (result) {
					callback(result,valorOfrecido)
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
					var texto = "Error al realizar la puja" + textStatus + " " + errorThrown;
					articulo.notify ('notifyNoOk',".myAlert-top2",texto);
                }
            });
		},

        changeState: function (result,valorOfrecido,id,usuario,nombreArt) {

            $.ajax({
                url: "/publicacion/setOferta/"+valorOfrecido+"/"+result+"/"+id,
                type: "PUT",
                data: JSON.stringify(result),
                contentType: "application/json",
                success: function () {
					var lista = {valor:valorOfrecido , usuario:usuario , nombreArt:nombreArt};
					stompClient.send("/articulo/"+id, {}, JSON.stringify(lista));
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
		},
		getCliente: function(id) {
			$.ajax({
				url: "/oferta/getUsuarioById/"+id,
				success: function (result) {
					$("#oferta").html(result+" tiene este producto");
				},
				async: true
			});
		},
		addToFavorite: function(usuario,publicacion) {
			$.ajax({
				url: "/preferencia/"+usuario+"/"+publicacion,
				type: "POST",
				data: JSON.stringify(usuario),
				contentType: "application/json",
				success: function () {
					articulo.notify ('notifyOk',".myAlert-top","Añadido a favoritos con éxito");
				},
				async: true
			});
		},
		setPujaEnCurso: function(id) {
			$.ajax({
				url: "/publicacion/setPujaEnCurso/"+id,
				type: "PUT",
				success: function (result) {
				},
				async: true
			});
		},
		deletePujaEnCurso: function(id) {
			$.ajax({
				url: "/publicacion/deletePujaEnCurso/"+id,
				type: "DELETE",
				success: function (result) {
				},
				async: true
			});
		}
	};

})();