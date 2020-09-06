
$(document).ready(function(){ // cuando inicie la pantalla 
alert("funcionando el jquery se esta usando el mismo JQuery integrado de alexia v-jquery-3.2.1.js");
$('ul.tabs li a:first').addClass('active');
	$('.secciones article').hide();
	$('.secciones article:first').show();

	$('ul.tabs li a').click(function(){
		$('ul.tabs li a').removeClass('active');
		$(this).addClass('active');
		$('.secciones article').hide();

		var activeTab = $(this).attr('href');
		$(activeTab).show();
		return false;
	});
	
	
	
});//FIN DEL SCRIPT