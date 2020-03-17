var articulo =(function(){
	var _id = 0;
	
	function getUrlVars() {
		var vars = {};
		var parts = window.location.href.replace(/[?&]+([^=&]+)=([^&]*)/gi, function(m,key,value) {
			vars[key] = value;
		});
		return vars;
	}
	
	var setId = function (id) {
        _id = id;
    }
	
	function setInformacion(art) {
			$("#descripcion").html(art.descripcion);
			$("#valor").html(art.valor);
			$("#fecha_de_subasta").html(art.fecha_de_subasta);
			$("#usado").html(art.usado);
			$("#estado").html(art.estado);
			$("#oferta").html(art.oferta);
			$("#categoria").html(art.categoria);
			$("#usuario").html(art.usuario);
			$("#nombre").html(art.nombre);
			$("#ubicacion").html(art.ubicacion);
			$("#marca").html(art.marca);
	}
	
	
	return {
		setID: function(){
			var id = getUrlVars()["var1"];
			setId(id);
		},
		setInfo: function(){
			articuloCliente.getArticulo(setInformacion,_id);
		}
	};
})();