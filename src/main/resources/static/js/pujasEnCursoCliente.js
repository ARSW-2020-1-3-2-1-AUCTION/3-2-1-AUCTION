pujasEnCursoCliente = (function() {
	 return {
		getPujasEnCurso: function(callback){
            $.ajax({
                url: "/publicacion/getPujasEnCurso",
                success: function (result) {
					callback(result);
				},
				async: true
             });
        }
	 }
})();