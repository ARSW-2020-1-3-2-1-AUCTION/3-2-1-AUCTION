var publicar1 =(function(){
	var lista = [];
	var nombre = "";
	var ubicacion = "";
	var categoria = "";
	var marca = "";
	var usado = "";
	var calendario = "";
	var descripcion = "";
	var imagen = "";
	var valor = 0;
	var usuario = "";
	
	function setValues() {
		nombre = document.getElementById("nombre").value;
		ubicacion = document.getElementById("ubicacion").value;
		categoria = document.getElementById("categoria").value;
		marca = document.getElementById("marca").value;
		usado = document.getElementById("usado").value;
		calendario = document.getElementById("calendario").value;
		descripcion = document.getElementById("descripcion").value;
		valor = document.getElementById("valor").value;
		usuario = document.getElementById("user").innerText;
		if (nombre=="" || ubicacion=="" || categoria=="" || marca=="" || usado=="" || calendario=="" || descripcion=="" || usuario==""){
			alert("Para publicar ningún campo puede ser vacío")
		} else {
			lista = {nombre: nombre, ubicacion: ubicacion, categoria: categoria, marca: marca,usado: usado, fechaDeSubasta: calendario,descripcion: descripcion, valor: valor, usuario:usuario};
			alert(JSON.stringify(lista));
			publicar1Cliente.putArticulo(JSON.stringify(lista));
		}		
	}
	
	function setCalendario() {
		document.getElementById("calendario").datetimepicker();
	}
	
	return {
		setValues: setValues,
		setCalendario: setCalendario
	};
	
})();