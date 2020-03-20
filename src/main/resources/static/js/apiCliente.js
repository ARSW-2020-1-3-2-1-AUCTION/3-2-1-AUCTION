apiCliente= (function(){
    return {
        saveCuenta: function(usuario){
            $.ajax({
                url: "usuario/" ,
                type: "POST",
                data: JSON.stringify(usuario),
                contentType: "application/json",
                success: function() {
                  alert("Usuario "+usuario.id+" se creó correctamente");
                   location.href = "/login.html";
                },
                 error: function(XMLHttpRequest, textStatus, errorThrown) { 
                    alert("Error: El nombre de usuario no esta disponible, intente nuevamente"); 
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
                     alert("Usuario no encontrado");
                     
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
                    alert("Error: El nombre de usuario no esta disponible, intente nuevamente"); 
                }
            });
        }
    };
})();