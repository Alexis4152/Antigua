package org.contact.service;

import java.util.List;
import org.contact.model.ModelAgregarProductos_isa;
import org.contact.model.ModelProductos_isa;



public interface JdbcServiceAgregarProductos_isa {
	
	public List<ModelAgregarProductos_isa> listaProductos(); // listarde productos
	
	/*   ===============>>>>> ESTOY DENTRO DEL SERVICION ==>> Agregar nuevas ventas a creditos */
	public void AgregarNewProducto(ModelAgregarProductos_isa agregarProductos);
	
}
