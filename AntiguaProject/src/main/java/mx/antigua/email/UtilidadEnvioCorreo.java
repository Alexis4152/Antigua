package mx.antigua.email;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.antigua.utilities.*;	

@SuppressWarnings("unused")
public class UtilidadEnvioCorreo{

	private UtilidadEnvioCorreo(){
	}

	public static boolean enviarCorreo(String asunto,String contenido, String destinatarios){
System.out.println("Prepara envio de correo, asunto: "+asunto+" contenido: "+contenido+" destinatarios "+destinatarios);
		return EnvioCorreo.enviaCorreo(asunto, contenido, destinatarios);
	}

}
