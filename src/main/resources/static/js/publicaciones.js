var publicaciones =(function(){
	return {
		setHref: function() {
			var c = document.getElementById("c").href+"?user="+document.getElementById("user").innerText;
			document.getElementById("c").href = c;
			var f = document.getElementById("f").href+"?user="+document.getElementById("user").innerText;
			document.getElementById("f").href = f;
			var p = document.getElementById("p").href+"?user="+document.getElementById("user").innerText;
			document.getElementById("p").href = p;
			var mp = document.getElementById("mp").href+"?user="+document.getElementById("user").innerText;
			document.getElementById("mp").href = mp;
			var pec = document.getElementById("pec").href+"?user="+document.getElementById("user").innerText;
			document.getElementById("pec").href = pec;
		}
	};
}