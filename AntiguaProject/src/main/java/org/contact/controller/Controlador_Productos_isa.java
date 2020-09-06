package org.contact.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.contact.dao.JdbcUsuarios;
import org.contact.dao.JdbcDaoUsuariosInterface;
import org.contact.dao.JdbcDaoParametrosInterface;
import org.contact.dao.JdbcParametros;
import org.contact.model.ACCESO_USUARIOS;
import org.contact.model.ModelProductos_isa;
import org.contact.model.PARAMETROS;
import org.contact.service.JdbcServiceUsuariosInterface;

import org.contact.service.JdbcServiceParametrosInterface;
import org.contact.service.JdbcServiceProductos_isa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.UserDetailsManager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import mx.telcel.util.Constantes;
import mx.telcel.util.Herramientas;


@Controller
public class Controlador_Productos_isa{
	//INTERFACE,SERVICIO,CLASE DE IMPLEMENTACIÓN,DAO,DATA,ACCESS,OBJECT
	
	
//	@Autowired
//	private JdbcServiceVentasCredito_isa  serviceVentasCredito;
//	
	
	@Autowired
	private JdbcServiceProductos_isa  serviceVentasCredito;
	
	
	
	@SuppressWarnings("static-access")
	@RequestMapping("/Menu") // Set mapea la ruta de la pagina VentaACredito.jsp
	public String VentaACredito(ModelMap modelo) throws Exception {
//		 modelo.addAttribute("VENTA_CREDITO", new  ModelProductos_isa());
//		modelo.addAttribute("ListaVentasCredito", serviceVentasCredito.listaVentasCredito());
		System.out.println("Entro en el menu principal ==>> Controlador_Productos_isa");
		return "Menu";
	}
	
	
	
	
	
//	@RequestMapping(value = "/creditosnew", method = RequestMethod.POST)
//	@ResponseBody
//    public List<ModelVentasACredito_isa> inicioVentaACredito(HttpServletRequest request, HttpServletResponse response) {
//		//ModelAndView model =  new ModelAndView();
//		//model.addObject("ListaVentasCredito", serviceVentasCredito.listaVentasCredito());
//		List<ModelVentasACredito_isa> listanew = serviceVentasCredito.listaVentasCredito();
//		System.out.println("DEL JSON MODEL new isau --==>>" + listanew);
//		System.out.println("Controlador_VentaCredito_isa.inicioVentaACredito()");
//		return listanew;
//		
//	}
	
    
	/*   ===============>>>>> DENTRO DEL CONTROLLER => Agregar nuevas ventas a creditos */
	 @RequestMapping(value = "/NuevoVentaCred", method = RequestMethod.POST) //PARA AGREGAR NEW DATE
		public String addContact(@ModelAttribute("VENTA_CREDITO") ModelProductos_isa agregarCreditos,BindingResult result) {
		 serviceVentasCredito.AgregarNewVentaCredito(agregarCreditos);
		 System.out.println("Controlador_VentaCredito_isa.addContact() ISAUL #50 >>" + agregarCreditos.getNOMBRE_CREDITO() + agregarCreditos.getSUBTOTAL()+agregarCreditos.getESTADO_VENTA());
			return "VentaACredito";
		}
	
	
	
	
	
	
	
	
	
	
	
	
	/* PROBANDO PARA LLAMAR EL REQUEST DESDE JSON REFRESACAR LA TABLA PERO NO FUNCIONA AUN
	 * @RequestMapping("/ventas")
	public String MostrarVentasCredito(Model modelo){
		
		modelo.addAttribute("ListaVentasCredito", serviceVentasCredito.listaVentasCredito());
		System.out.println("lista de ventas a creditos ==>>" + serviceVentasCredito.listaVentasCredito());
		return "VentaACredito";
	} */
	
	
}