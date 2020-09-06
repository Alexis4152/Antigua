package org.contact.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;

import org.contact.model.ModelAgregarProductos_isa;
import org.contact.model.ModelProductos_isa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class JdbcDao_AgregarProductos_Impl_isa implements JdbcDao_AgregarProductos_isa{
	
	@Autowired
	private DataSource dataSource2;
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ModelAgregarProductos_isa> listaProductos() {
		jdbcTemplate.setDataSource(getDataSource2());
		String query = "select * from POLLERIA.PRODUCTOS";
		return jdbcTemplate.query(query, new ModelAgregarProductos_isaMapper());
	}
	
	
	@SuppressWarnings("rawtypes")
	private static final class ModelAgregarProductos_isaMapper implements ParameterizedRowMapper{
		public ModelAgregarProductos_isa mapRow(ResultSet rs, int rowNum) throws SQLException {
			ModelAgregarProductos_isa productos = new ModelAgregarProductos_isa();	
			
			productos.setID_PRODUCTO(rs.getInt("ID_PRODUCTO"));
			productos.setNOMBRE_PRODUCTO(rs.getString("NOMBRE_PRODUCTO"));
			productos.setTIPO_PRODUCTO(rs.getString("TIPO_PRODUCTO"));			   
			productos.setPRECIO(rs.getFloat("PRECIO"));
			productos.setCANTIDAD(rs.getFloat("CANTIDAD"));			
//			productos.setPAGO(rs.getInt("PAGO"));
			productos.setFECHA(rs.getDate("FECHA"));			
		
			  return productos;
		}
	}
	
	
	
	/*   ===============>>>>>ESTOY DENTRO DE LA IMPLEMENTACION DEL DAO ==>>> Agregar nuevas ventas a creditos */
	public void AgregarNewProducto(ModelAgregarProductos_isa agregarProductos) {
		jdbcTemplate.setDataSource(getDataSource2());
		String query = "INSERT INTO PRODUCTOS(NOMBRE_PRODUCTO, TIPO_PRODUCTO, PRECIO, CANTIDAD, FECHA) VALUES(?,?,?,?, SYSDATE)";
		jdbcTemplate.update(query,  agregarProductos.getNOMBRE_PRODUCTO(),agregarProductos.getTIPO_PRODUCTO(), agregarProductos.getPRECIO() , agregarProductos.getCANTIDAD());
	 System.out.println("JdbcDao_VentasCredito_Impl_isa.AgregarNewVentaCredito(): ISAUL #01: ====>>>SUCCEFUL ADD PRODUCTOS ==> ");
	}
	
	
	/*
	 public void AgregarNewProducto(ModelAgregarProductos_isa agregarProductos) {
		jdbcTemplate.setDataSource(getDataSource2());
		String query = "INSERT INTO PRODUCTOS(NOMBRE_PRODUCTO, TIPO_PRODUCTO, PRECIO, CANTIDAD,ID_USUARIO, FECHA) VALUES(?,?,?,(SELECT ID_USER FROM ACCESO_USUARIOS WHERE USERNAME='"+Herramientas.obtener_nombre_de_usuario_loggeado()+"' AND HABILITADO = 'Y'), SYSDATE)";
		jdbcTemplate.update(query,  agregarProductos.getNOMBRE_PRODUCTO(),agregarProductos.getTIPO_PRODUCTO(), agregarProductos.getPRECIO() , agregarProductos.getCANTIDAD());
	 System.out.println("JdbcDao_VentasCredito_Impl_isa.AgregarNewVentaCredito(): ISAUL #01: ====>>>SUCCEFUL ADD PRODUCTOS ==> ");
	}
	
	  */
	
	
	public int OBTENER_ID_USUARIO(String USUARIO) {
		jdbcTemplate.setDataSource(getDataSource2());
		String query ="SELECT ID_USER FROM ACCESO_USUARIOS WHERE USERNAME='"+USUARIO+"' AND HABILITADO = 'Y'";
		return jdbcTemplate.queryForInt(query);
	}



//  
	
	
	public DataSource getDataSource2() {return dataSource2;}
	public void setDataSource2(DataSource dataSource2) {this.dataSource2 = dataSource2;}
	public JdbcTemplate getJdbcTemplate() {return jdbcTemplate;}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {this.jdbcTemplate = jdbcTemplate;}
}
