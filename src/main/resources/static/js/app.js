var Module =( function (){
        var nombreUsuario = ""; 	
        var checkPassword = function () {
            var username = $('#username').val();
            apiCliente.checkPassword(username, validarCuenta);
        }

var addAcount = function(){
            var id = $('#id').val();
            var contrasena = $('#contrasena').val();
            var verificacion = $('#nuevacontrasena').val();  
		
            if (contrasena == verificacion){
                var hash=CryptoJS.SHA256(contrasena);
                var usuario = { "id": id, "contrasena": hash.toString(), "saldo": 0,"puntuacion":5 };
                apiCliente.saveCuenta(usuario);

               
            }
            else{
                alert("Las contrasenas no coinciden");
            }
          
}


var validarCuenta = function (id) {
    var password = $('#psw').val();
    var hash = CryptoJS.SHA256(password);

    sessionStorage.setItem("currentUser", id.id);
    sessionStorage.setItem("currentUser", id.saldo);
    sessionStorage.setItem("currentUser", id.puntuacion);
    if (id.contrasena == hash) {
        location.href = "/categorias.html"
    }

    else {
        alert("Contrasena incorrecta");

    }
}
    var validarUsuario = function () {
        var user = sessionStorage.getItem('currentUser');

        if (user == null) {
            location.href = "/categorias.html";
        }

    }

    var cerrarSesion = function(){
        sessionStorage.setItem("currentUser",null);
        location.href = "/login.html";

    }        
    return{
        addAcount: addAcount,
        validarUsuario: validarUsuario,
        checkPassword: checkPassword,
        validarCuenta: validarCuenta,
        cerrarSesion: cerrarSesion
    };
})();