package org.contact.model;

import java.util.Date;
import oracle.sql.DATE;

public class ModelAgregarProductos_isa {
	private int ID_PRODUCTO;
	private String NOMBRE_PRODUCTO;
	private String TIPO_PRODUCTO;
	private float PRECIO;
	private float CANTIDAD;
	private int PAGO;	
	private Date FECHA;
	public int getID_PRODUCTO() {
		return ID_PRODUCTO;
	}
	public void setID_PRODUCTO(int iD_PRODUCTO) {
		ID_PRODUCTO = iD_PRODUCTO;
	}
	public String getNOMBRE_PRODUCTO() {
		return NOMBRE_PRODUCTO;
	}
	public void setNOMBRE_PRODUCTO(String nOMBRE_PRODUCTO) {
		NOMBRE_PRODUCTO = nOMBRE_PRODUCTO;
	}
	public String getTIPO_PRODUCTO() {
		return TIPO_PRODUCTO;
	}
	public void setTIPO_PRODUCTO(String tIPO_PRODUCTO) {
		TIPO_PRODUCTO = tIPO_PRODUCTO;
	}
	public float getPRECIO() {
		return PRECIO;
	}
	public void setPRECIO(float pRECIO) {
		PRECIO = pRECIO;
	}
	public float getCANTIDAD() {
		return CANTIDAD;
	}
	public void setCANTIDAD(float cANTIDAD) {
		CANTIDAD = cANTIDAD;
	}
	public int getPAGO() {
		return PAGO;
	}
	public void setPAGO(int pAGO) {
		PAGO = pAGO;
	}
	public Date getFECHA() {
		return FECHA;
	}
	public void setFECHA(Date fECHA) {
		FECHA = fECHA;
	}
	
	
	
	
	

}
