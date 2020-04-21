var app =( function (){
	var nombreUsuario = ""; 	
    var checkPassword = function () {
    
		var username = $('#username').val();
        apiCliente.checkPassword(username, validarCuenta);
    }

	var addAcount = function(){
        var id = $('#id').val();
        var contrasena = $('#contrasena').val();
        var verificacion = $('#nuevacontrasena').val();
		var sinEspacio = true;
		var i;
		
		for (i = 0; i < id.length ; i++){
			if(id.charAt(i) == " "){
				sinEspacio = false;
			}
		}
		
        if (contrasena == verificacion && sinEspacio){
            var hash=CryptoJS.SHA256(contrasena);
            var usuario = { "id": id, "contrasena": hash.toString(), "saldo": 0,"puntuacion":5 };
            apiCliente.saveCuenta(usuario);
        }
        else{
			if (!sinEspacio){
				notify ('notifyNoOk',".myAlert-top2","El UserName no puede tener espacios");
			} else {
				notify ('notifyNoOk',".myAlert-top2","Las contraseñas no coinciden");
			}
        }      
	}


	var validarCuenta = function (id) {
		var password = $('#psw').val();
		var hash = CryptoJS.SHA256(password);
		sessionStorage.setItem("currentUser", id.id);
		
		if (id.contrasena == hash) {
			apiCliente.saveUserCache(id);
			location.href = "/categorias.html?user="+sessionStorage.getItem('currentUser');
		}

		else {
			notify ('notifyNoOk',".myAlert-top2","Contraseña incorrecta");
		}
	}
	
    var validarUsuario = function () {
        var user = sessionStorage.getItem('currentUser');

        if (user == null) {
            location.href = "/categorias.html?user="+sessionStorage.getItem('currentUser');
        }

    }

    var cerrarSesion = function(){
        sessionStorage.setItem("currentUser",null);
        location.href = "/login.html";

    }
	
	function notify (tipo,alerta,mensaje){
		document.getElementById(tipo).innerHTML = mensaje;
		$(alerta).show();
		setTimeout(function(){
			$(alerta).hide();
		}, 5000);
	}
	
    return{
        addAcount: addAcount,
		checkPassword: checkPassword,
        validarUsuario: validarUsuario,
        validarCuenta: validarCuenta,
        cerrarSesion: cerrarSesion,
		notify: notify
    };
})();