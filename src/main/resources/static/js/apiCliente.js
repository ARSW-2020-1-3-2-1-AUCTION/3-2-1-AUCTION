apiCliente= (function(){
    return {
        saveCuenta: function(usuario){
            $.ajax({
                url: "usuario/" ,
                type: "POST",
                data: JSON.stringify(usuario),
                contentType: "application/json",
                success: function() {
					var texto = "Usuario "+usuario.id+" se creó correctamente";
					app.notify('notifyOk',".myAlert-top",texto);
					location.href = "/login.html";
                },
                 error: function(XMLHttpRequest, textStatus, errorThrown) { 
					app.notify ('notifyNoOk',".myAlert-top2","El nombre de usuario no está disponible, intente con un userName distinto");
                }
            });
        },

        checkPassword: function(id,callback){
            jQuery.ajax({
                url: "usuario/" + id ,
                success: function(result) {
                  callback(result);
                },
                 error: function(XMLHttpRequest, textStatus, errorThrown) { 
					 app.notify ('notifyNoOk',".myAlert-top2","Usuario no encontrado");
                     
                } ,
                async: true
            });
        },
		
		saveUserCache: function(usuario){
            $.ajax({
                url: "usuario/saveUserCache" ,
                type: "POST",
                data: JSON.stringify(usuario),
                contentType: "application/json",
                success: function() {
                },
                 error: function(XMLHttpRequest, textStatus, errorThrown) { 
					app.notify ('notifyNoOk',".myAlert-top2","El nombre de usuario no esta disponible, intente nuevamente");
                }
            });
        }
    };
})();