package org.contact.model;

import oracle.sql.DATE;

public class ModelProductos_isa {
	private int ID_VENTA;
	private int ID_USUARIO;
	private int DESCUENTO;
	private int TOTAL;
	private int SUBTOTAL;
	private int PAGO;
	private int CAMBIO;
	private String ESTADO_VENTA;
	private String NOMBRE_CREDITO;
	private String FECHA;
	public int getID_VENTA() {
		return ID_VENTA;
	}
	public void setID_VENTA(int iD_VENTA) {
		ID_VENTA = iD_VENTA;
	}
	public int getID_USUARIO() {
		return ID_USUARIO;
	}
	public void setID_USUARIO(int iD_USUARIO) {
		ID_USUARIO = iD_USUARIO;
	}
	public int getDESCUENTO() {
		return DESCUENTO;
	}
	public void setDESCUENTO(int dESCUENTO) {
		DESCUENTO = dESCUENTO;
	}
	public int getTOTAL() {
		return TOTAL;
	}
	public void setTOTAL(int tOTAL) {
		TOTAL = tOTAL;
	}
	public int getSUBTOTAL() {
		return SUBTOTAL;
	}
	public void setSUBTOTAL(int sUBTOTAL) {
		SUBTOTAL = sUBTOTAL;
	}
	public int getPAGO() {
		return PAGO;
	}
	public void setPAGO(int pAGO) {
		PAGO = pAGO;
	}
	public int getCAMBIO() {
		return CAMBIO;
	}
	public void setCAMBIO(int cAMBIO) {
		CAMBIO = cAMBIO;
	}
	public String getESTADO_VENTA() {
		return ESTADO_VENTA;
	}
	public void setESTADO_VENTA(String eSTADO_VENTA) {
		ESTADO_VENTA = eSTADO_VENTA;
	}
	public String getNOMBRE_CREDITO() {
		return NOMBRE_CREDITO;
	}
	public void setNOMBRE_CREDITO(String nOMBRE_CREDITO) {
		NOMBRE_CREDITO = nOMBRE_CREDITO;
	}
	public String getFECHA() {
		return FECHA;
	}
	public void setFECHA(String fECHA) {
		FECHA = fECHA;
	}
	
	
	

}
