package org.contact.dao;

import java.util.List;

import org.contact.model.ModelProductos_isa;

public interface JdbcDao_VentasCredito_isa {

	public List<ModelProductos_isa> listaVentasCredito();
	
	/*   ===============>>>>>ESTOY DENTRO DEL DAO ==>>> Agregar nuevas ventas a creditos */
	public void AgregarNewVentaCredito(ModelProductos_isa agregarCreditos);
	
}
