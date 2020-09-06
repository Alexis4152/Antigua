package org.contact.service;

import java.util.List;
import org.contact.dao.JdbcDao_Acceso_Usuarios_Alexis;
import org.contact.dao.JdbcDao_VentasCredito_isa;
import org.contact.model.ACCESO_USUARIOS;
import org.contact.model.ModelProductos_isa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JdbcServiceProductosImpl_isa implements JdbcServiceProductos_isa{
	
	@Autowired
	private JdbcDao_VentasCredito_isa Dao;
	
	/*   ===============>>>>> Listar ventas a creditos */
	@Override
	@Transactional  
	public List<ModelProductos_isa> listaVentasCredito(){
		return Dao.listaVentasCredito();
		
	}
	
	/*   ===============>>>>> ESTOY DENTRO DE LA IMPLEMENTACION DEL SERVICIO  ==> Agregar nuevas ventas a creditos */
	@Override
	@Transactional 
	public void AgregarNewVentaCredito(ModelProductos_isa agregarCreditos) {
		System.out.println("JdbcServiceVentasCreditoImpl_isa.AgregarNewVentaCredito()  ISAUL #50 >>");
		 Dao.AgregarNewVentaCredito(agregarCreditos);				
	}
	
}
