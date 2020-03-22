publicar1Cliente = (function() {
	 return {
		putArticulo: function(articulo){
            $.ajax({
                url: "/publicacion",
                type: "POST",
                data: articulo,
                contentType: "application/json"
             });
        }
	 }
})();