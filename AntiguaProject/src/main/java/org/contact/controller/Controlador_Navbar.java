package org.contact.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.contact.dao.JdbcUsuarios;
import org.contact.dao.JdbcDaoUsuariosInterface;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.contact.dao.JdbcDaoParametrosInterface;
import org.contact.dao.JdbcParametros;
import org.contact.model.ACCESO_USUARIOS;
import org.contact.model.ModelAgregarProductos_isa;
import org.contact.model.ModelProductos_isa;
import org.contact.model.PARAMETROS;
import org.contact.service.JdbcServiceUsuariosInterface;
import org.contact.service.JdbcServiceAgregarProductos_isa;
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
public class Controlador_Navbar{

	
//	@Autowired
//	private JdbcServiceAgregarProductos_isa  serviceProductos;
//	
	
	
	@RequestMapping(value ="/Navbar", method = RequestMethod.GET) // Set mapea la ruta de la pagina VentaACredito.jsp
	public String ListaProductos(ModelMap modelo) throws JsonGenerationException, JsonMappingException, IOException {							
//	ObjectMapper mapper = new ObjectMapper();
//		modelo.addAttribute("PRODUCTOS", new  ModelAgregarProductos_isa());
//		modelo.addAttribute("ListaAgregarProductos", mapper.writeValueAsString(serviceProductos.listaProductos()));
		System.out.println("NEW CONTROLLER CALENDAR ===>> navbar navbar");
		return "Navbar";
	}
	
	
	
	
}