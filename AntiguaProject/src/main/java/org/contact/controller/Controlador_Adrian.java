package org.contact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador_Adrian {
	
	@RequestMapping("/Mobiliario")
	public String MostrarUsuarios(){
		//Salones y usuarios
		return "Mobiliario";
	}

}
