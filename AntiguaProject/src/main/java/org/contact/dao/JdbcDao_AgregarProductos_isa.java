package org.contact.dao;

import java.util.List;

import org.contact.model.ModelAgregarProductos_isa;
import org.contact.model.ModelProductos_isa;

public interface JdbcDao_AgregarProductos_isa {

	public List<ModelAgregarProductos_isa> listaProductos();
	
	/*   ===============>>>>>ESTOY DENTRO DEL DAO ==>>> Agregar nuevas ventas a creditos */
	public void AgregarNewProducto(ModelAgregarProductos_isa agregarProductos);
	
	public int OBTENER_ID_USUARIO(String USUARIO);

}
