package org.contact.service;

import java.util.List;
import org.contact.dao.JdbcDao_Acceso_Usuarios_Alexis;
import org.contact.dao.JdbcDao_AgregarProductos_isa;
import org.contact.dao.JdbcDao_VentasCredito_isa;
import org.contact.model.ACCESO_USUARIOS;
import org.contact.model.ModelAgregarProductos_isa;
import org.contact.model.ModelProductos_isa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JdbcServiceAgregarProductosImpl_isa implements JdbcServiceAgregarProductos_isa{
	
	@Autowired
	private JdbcDao_AgregarProductos_isa Dao;
	
	/*   ===============>>>>> Listar ventas a creditos */
	@Override
	@Transactional  
	public List<ModelAgregarProductos_isa> listaProductos(){
		return Dao.listaProductos();
		
	}
	
	/*   ===============>>>>> ESTOY DENTRO DE LA IMPLEMENTACION DEL SERVICIO  ==> Agregar nuevas ventas a creditos */
	@Override
	@Transactional 
	public void AgregarNewProducto(ModelAgregarProductos_isa agregarProductos) {
		System.out.println("JdbcServiceVentasCreditoImpl_isa.AgregarNewVentaCredito()  ISAUL new #500 =>>");
		 Dao.AgregarNewProducto(agregarProductos);				
	}
	
}
