package com.uisrael.farmaciagfcc.dominio.entidades;

import java.util.Date;

public class inventarios {
	
	private int idInventario;
	private String stock;
	private String stockMinimo;
	private Date fechaActualizacion;
	private boolean estado;
	public inventarios(int idInventario, String stock, String stockMinimo, Date fechaActualizacion, boolean estado) {
		this.idInventario = idInventario;
		this.stock = stock;
		this.stockMinimo = stockMinimo;
		this.fechaActualizacion = fechaActualizacion;
		this.estado = estado;
	}
	public inventarios() {
	}
	public int getIdInventario() {
		return idInventario;
	}
	public void setIdInventario(int idInventario) {
		this.idInventario = idInventario;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getStockMinimo() {
		return stockMinimo;
	}
	public void setStockMinimo(String stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
	
	
	

}
