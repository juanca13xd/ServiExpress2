package com.serviexpress.entities;

import java.io.Serializable;

public class Detalle_Comprobante implements Serializable {

	private int detalle_com;
	private int cantidad;

	public Detalle_Comprobante() {

	}

	public Detalle_Comprobante(int detalle_com, int cantidad) {
		super();
		this.detalle_com = detalle_com;
		this.cantidad = cantidad;
	}

	public int getDetalle_com() {
		return detalle_com;
	}

	public void setDetalle_com(int detalle_com) {
		this.detalle_com = detalle_com;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	private static final long serialVersionUID = 1L;


}
