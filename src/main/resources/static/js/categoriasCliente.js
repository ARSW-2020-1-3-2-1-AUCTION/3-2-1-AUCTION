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
		},
		deleteUserCache: function(usuario){
            $.ajax({
                url: "usuario/deleteUserCache/"+usuario ,
                type: "DELETE",
                data: JSON.stringify(usuario),
                contentType: "application/json",
                success: function() {
                },
                 error: function(XMLHttpRequest, textStatus, errorThrown) { 
					categorias.notify('notifyNoOk',".myAlert-top2","Usted no ha iniciado ninguna sesión");
                }
            });
        },
		existUsername: function(usuario,callback){
            $.ajax({
                url: "usuario/existUsername/"+usuario ,
                success: function(result) {
					callback(result);
                },
                 error: function(XMLHttpRequest, textStatus, errorThrown) { 
					categorias.notify('notifyNoOk',".myAlert-top2","Usted no ha iniciado ninguna sesión");
                }
            });
        },
		getSaldo: function(usuario,callback){
            $.ajax({
                url: "usuario/getSaldo/"+usuario ,
                contentType: "application/json",
                success: function(result) {
					callback(result);
                },
                 error: function(XMLHttpRequest, textStatus, errorThrown) { 
                    categorias.notify('notifyNoOk',".myAlert-top2","Usted no ha iniciado ninguna sesión"); 
                }
            });
        }
	};
})();