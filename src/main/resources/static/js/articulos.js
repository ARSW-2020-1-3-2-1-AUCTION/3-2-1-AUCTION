var articulos =(function(){
	var cate = "";
	function getUrlVars() {
		var vars = {};
		var parts = window.location.href.replace(/[?&]+([^=&]+)=([^&]*)/gi, function(m,key,value) {
			vars[key] = value;
		});
		return vars;
	}
	
	var setName = function (name) {
        cate = name;
        $( "#articulo" ).html(cate);
    }
	
	return {
		setcate: function(){
			var cate = getUrlVars()["var1"];
			setName(cate);
		},
	};
	
})();