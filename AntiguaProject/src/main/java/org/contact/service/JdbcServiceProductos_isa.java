package org.contact.service;

import java.util.List;

import org.contact.model.ModelProductos_isa;



public interface JdbcServiceProductos_isa {
	
	public List<ModelProductos_isa> listaVentasCredito(); // listar las vebtas a creditos
	
	/*   ===============>>>>> ESTOY DENTRO DEL SERVICION ==>> Agregar nuevas ventas a creditos */
	public void AgregarNewVentaCredito(ModelProductos_isa agregarCreditos);
	
}
