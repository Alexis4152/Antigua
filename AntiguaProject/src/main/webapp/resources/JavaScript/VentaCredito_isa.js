
$(document).ready(function(){ // cuando inicie la pantalla 
	
	$('#btn_agregar').on('click', function() { // Boton agregar cuando se oprime (abre modal) debe de vaciar los campos ya k los int aparecen en los txc como 0.0
		$('#PRODUCTO').val("");
		$('#TIPO').val("");
		$('#PRECIO').val("");
		$('#PIEZAS').val("");
	});
	
	$('#btn_Guardar_producto').prop('disabled',true); // al iniciar toda la pagina se tiene blokeado el boton de guardar
		
	function COMPROBAR_SI_YA_SE_PUEDE_ACTIVAR_EL_BOTON_ADD(){ //  function evaluacion general de los txt si estan vacios o no para activar el boton save
		var a= $('#PRODUCTO').val();
		var b= $('#TIPO').val();
		var d= $('#PRECIO').val();
		var v= $('#PIEZAS').val();
				
		if(a!=""&& b!=""&& d!=""&& v!=""){ 		// la evaluacion de los txt vacios	
			$('#btn_Guardar_producto').prop('disabled',false); 						
		}
		else{
			$('#btn_Guardar_producto').prop('disabled',true);
		}
	}
	
	

		$('#PRODUCTO').keyup(function(e) {							 // Evento Keyup para evaluar el campos txt
		var a = $('#PRODUCTO').val();     							 // Se obtiene el valor del txt
		if (a != "") {  											 // Si el campo es vacio o no se ACTIVA/DES-ACT						
			COMPROBAR_SI_YA_SE_PUEDE_ACTIVAR_EL_BOTON_ADD();         // Se llama la function k activa el boton depende k si todos los txt este llenos o vacios  
		} else {
			$('#btn_Guardar_producto').prop('disabled', true);
		}
	});
	

			$('#TIPO').keyup(function(e) {
		var b = $('#TIPO').val();
		if (b != "") {
			COMPROBAR_SI_YA_SE_PUEDE_ACTIVAR_EL_BOTON_ADD();
		} else {
			$('#btn_Guardar_producto').prop('disabled', true);
		}
	});
			

				$('#PRECIO').keyup(function(e) {
		var d = $('#PRECIO').val();
		if (d != "") {
			COMPROBAR_SI_YA_SE_PUEDE_ACTIVAR_EL_BOTON_ADD();
		} else {
			$('#btn_Guardar_producto').prop('disabled', true);
		}
	});
			
			
				$('#PIEZAS').keyup(function(e) {
		var v = $('#PIEZAS').val();
		if (v != "") {
			COMPROBAR_SI_YA_SE_PUEDE_ACTIVAR_EL_BOTON_ADD();
		} else {
			$('#btn_Guardar_producto').prop('disabled', true);
		}
	});				
				
					$('#btn_cerrar_producto').on('click', function() { // Boton cancelar cuando se oprime debe de vaciar los campos si esk tenia datos
		$('#PRODUCTO').val("");
		$('#TIPO').val("");
		$('#PRECIO').val("");
		$('#PIEZAS').val("");
			$('#btn_Guardar_producto').prop('disabled', true);   // blokea el boton
	});

					var modal = document.getElementById('modalAgregarProductos');
	//CUANDO EL USUARIO DA CLIC EN CUALQUIER PARTE FUERA DEL MODAL, EL MODAL SE CIERRA
	window.onclick = function(event) {
		if (event.target == modal) {
			modal.style.display = "none";
			//LOS CAMPOS DE TEXTO PARA AGREGAR deben de vaciarse
			$('#PRODUCTO').val("");
			$('#TIPO').val("");
			$('#PRECIO').val("");
			$('#PIEZAS').val("");			
				$('#btn_Guardar_producto').prop('disabled', true);   // blokea el boton
		}
	}		
	
		
});//FIN DEL SCRIPT 









