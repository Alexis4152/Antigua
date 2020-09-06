package org.contact.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.contact.model.ModelProductos_isa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class JdbcDao_VentasCredito_Impl_isa implements JdbcDao_VentasCredito_isa{
	
	@Autowired
	private DataSource dataSource2;
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ModelProductos_isa> listaVentasCredito() {
		jdbcTemplate.setDataSource(getDataSource2());
		String query = "select * from POLLERIA.venta";
		return jdbcTemplate.query(query, new ModelVentasACredito_isaMapper());
	}
	
	
	@SuppressWarnings("rawtypes")
	private static final class ModelVentasACredito_isaMapper implements ParameterizedRowMapper{
		public ModelProductos_isa mapRow(ResultSet rs, int rowNum) throws SQLException {
			ModelProductos_isa valorCreditos = new ModelProductos_isa();	
			
			valorCreditos.setID_VENTA(rs.getInt("ID_VENTA"));
			valorCreditos.setID_USUARIO(rs.getInt("ID_USUARIO"));
			valorCreditos.setDESCUENTO(rs.getInt("DESCUENTO"));
			valorCreditos.setTOTAL(rs.getInt("TOTAL"));
			valorCreditos.setSUBTOTAL(rs.getInt("SUBTOTAL"));
			valorCreditos.setPAGO(rs.getInt("PAGO"));
			valorCreditos.setCAMBIO(rs.getInt("CAMBIO"));
			valorCreditos.setESTADO_VENTA(rs.getString("ESTADO_VENTA"));
			valorCreditos.setNOMBRE_CREDITO(rs.getString("NOMBRE_CREDITO"));
			valorCreditos.setFECHA(rs.getString("FECHA"));
			
		
			  return valorCreditos;
		}
	}
	
	
	
	/*   ===============>>>>>ESTOY DENTRO DE LA IMPLEMENTACION DEL DAO ==>>> Agregar nuevas ventas a creditos */
	public void AgregarNewVentaCredito(ModelProductos_isa agregarCreditos) {
		jdbcTemplate.setDataSource(getDataSource2());
		String query = "INSERT INTO VENTA(ID_USUARIO,SUBTOTAL, PAGO, ESTADO_VENTA, NOMBRE_CREDITO) VALUES(1,?,?,?,?)";
		jdbcTemplate.update(query,  agregarCreditos.getSUBTOTAL(),agregarCreditos.getPAGO(), agregarCreditos.getESTADO_VENTA() , agregarCreditos.getNOMBRE_CREDITO());
	 System.out.println("JdbcDao_VentasCredito_Impl_isa.AgregarNewVentaCredito(): ISAUL #01: ====>>>SUCCEFUL");
	}
	
	
	
	
	
	
	public DataSource getDataSource2() {return dataSource2;}
	public void setDataSource2(DataSource dataSource2) {this.dataSource2 = dataSource2;}
	public JdbcTemplate getJdbcTemplate() {return jdbcTemplate;}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {this.jdbcTemplate = jdbcTemplate;}
}
