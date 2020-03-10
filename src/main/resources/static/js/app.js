var Module =( function (){
        var nombreUsuario = ""; 	
         var  checkPassword= function(){
            var id = $('#id').val();
            apiCliente.checkPassword(id,validarCuenta);
        }

var addAcount = function(){
            var id = $('#id').val();
            var contrasena = $('#contrasena').val();
            var verificacion = $('#contrasena').val();  
		
	    if (password == passwordtwo){
            	var hash=CryptoJS.encriptacion(contrasena);

                var usuario = {"id":name,"contrasena":hash.toString()};
                apiCliente.saveCuenta(usuario);

               
            }
            else{
                alert("Las contrasenas no coinciden");
            }
            
        }

var validarCuenta = function(id){
            var contrasena = $('#contrasena').val();
            var verificar= CryptoJS.SHA256(contrasena);             

            sessionStorage.setItem("currentUser",id.id);
	    
	    if (id.contrasena == hash){
		location.href = "/index.html"
		}
	
	    else{
		alert("Contrasena incorrecta");

		}
var validarUsuario = function(){
            var user = sessionStorage.getItem('currentUser');
            
            if (user==null){
                location.href = "/index.html";
            }
               
        }
var cerrarSesion = function(){
        sessionStorage.setItem("currentUser",null);
        location.href = "/index.html";

    }        
return{
	addAcount: addAcount,
	validarUsuario: validarUsuario,
	checkPassword: checkPassword,
	validarCuenta: validarCuenta,
	cerrarSesion: cerrarSesion
}