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
public class Controlador_AgregarProductos_isa{

	
	@Autowired
	private JdbcServiceAgregarProductos_isa  serviceProductos;
	
	
//	ESTO ES LA K TENIA K ESTABA FUNCIONANDO PARA LA TALA NORMAL
//	@SuppressWarnings("static-access")
//	@RequestMapping(value ="/AgregarProductos", method = RequestMethod.GET) // Set mapea la ruta de la pagina VentaACredito.jsp
//	public String ListaProductos(ModelMap modelo) throws Exception {
//		 modelo.addAttribute("PRODUCTOS", new  ModelAgregarProductos_isa());
//		modelo.addAttribute("ListaAgregarProductos", serviceProductos.listaProductos());
//		System.out.println("lista de ventas a creditos ==>>" + serviceProductos.listaProductos().size());
//		return "AgregarProductos";
//	}
//	
	
	
	
	@RequestMapping(value ="/AgregarProductos", method = RequestMethod.GET) // Set mapea la ruta de la pagina VentaACredito.jsp
	public String ListaProductos(ModelMap modelo) throws JsonGenerationException, JsonMappingException, IOException {							
	ObjectMapper mapper = new ObjectMapper();
		modelo.addAttribute("PRODUCTOS", new  ModelAgregarProductos_isa());
		modelo.addAttribute("ListaAgregarProductos", mapper.writeValueAsString(serviceProductos.listaProductos()));
		return "AgregarProductos";
	}
	
//	System.out.println("lista de ventas a creditos ==>>" + serviceProductos.listaProductos().size());
	
	
	
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
	 @RequestMapping(value = "/NuevoProducto", method = RequestMethod.POST) //PARA AGREGAR NEW DATE
		public String addContact(@ModelAttribute("PRODUCTOS") ModelAgregarProductos_isa agregarProductos,BindingResult result) {
		 serviceProductos.AgregarNewProducto(agregarProductos);
		// System.out.println("Controlador ==>>  agregarProductos() ISAUL #products =>>" + agregarProductos.getNOMBRE_CREDITO() + agregarProductos.getSUBTOTAL()+agregarProductos.getESTADO_VENTA());
			return "AgregarProductos";
		}
	
	
	
	
	
	 public static String USUARIO_LOGGEADO() {//PARA OBTENER EL NOMBRE DEL USUARIO
			String userName="";
			try {
				Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal(); //SE VERIFICA QUE EL USUARIO ESTÉ AUTENTIFICADO 
				UserDetails userDetails = null;
				if (principal instanceof UserDetails) {
				  userDetails = (UserDetails) principal;
				}
				userName = userDetails.getUsername(); //Aqui se guarda el nombre del usuario que está loggeado actualmente
				
			}catch(NullPointerException e) {
				System.out.println("Usuario no encontrado: "+e.getMessage());
			}
			return userName;
		}
	
	
	
	
	
	
	/* PROBANDO PARA LLAMAR EL REQUEST DESDE JSON REFRESACAR LA TABLA PERO NO FUNCIONA AUN
	 * @RequestMapping("/ventas")
	public String MostrarVentasCredito(Model modelo){
		
		modelo.addAttribute("ListaVentasCredito", serviceVentasCredito.listaVentasCredito());
		System.out.println("lista de ventas a creditos ==>>" + serviceVentasCredito.listaVentasCredito());
		return "VentaACredito";
	} */
	
	
}