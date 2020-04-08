var publicacionesCliente =(function(){
	return {
		getPublicaciones: function(id,callback) {
			$.ajax({
				url: "publicacion/ByUser/"+id,
				success: function (result) {
					callback(result);
				},
				async: true
			});
		}
	};
	
})();