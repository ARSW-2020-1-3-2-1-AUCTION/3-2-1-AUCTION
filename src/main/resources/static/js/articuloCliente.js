articuloCliente = (function() {
	return {
		saveOferta: function (Oferta,callback,valorOfrecido,respuesta,ultimaOferta) {
            $.ajax({
                url: "/oferta",
                type: "POST",
                data: JSON.stringify(Oferta),
                contentType: "application/json",
                success: function (result) {
					callback(result,valorOfrecido,respuesta,ultimaOferta)
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
					var texto = "Error al realizar la puja" + textStatus + " " + errorThrown;
					articulo.notify ('notifyNoOk',".myAlert-top2",texto);
                }
            });
		},

        changeState: function (result,valorOfrecido,id,usuario,nombreArt,respuesta,ultimaOferta) {

            $.ajax({
                url: "/publicacion/setOferta/"+valorOfrecido+"/"+result+"/"+id,
                type: "PUT",
                data: JSON.stringify(result),
                contentType: "application/json",
                success: function () {
					var lista = {valor:valorOfrecido , usuario:usuario , nombreArt:nombreArt , UserADevolverSaldo:respuesta , valorADevolver:ultimaOferta};
					stompClient.send("/articulo/"+id, {}, JSON.stringify(lista));
                }
            })
        },
		getArticulo: function(callback,articuloId,state) {
			$.ajax({
				url: "publicacion/getById/"+articuloId,
				success: function (result) {
					callback(result,state);
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
		},
		permitida: function(user,ultimaOferta,cantidadAPujar,saldoUsuario,callback,respuesta) {
			$.ajax({
				url: "/usuario/ofertaPermitida/"+user+"/"+ultimaOferta+"/"+cantidadAPujar,
				success: function (result) {
					callback(result,ultimaOferta,cantidadAPujar,saldoUsuario,respuesta);
				},
				async: true
			});
		}
	};

})();