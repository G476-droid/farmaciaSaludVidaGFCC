package com.uisrael.farmaciagfcc.presentacion.dto.response;

import java.util.Date;

public class InventariosResponseDto {
	
	private int idInventario;
	//private int idFarmacia;
	//private int idProducto;
	private String stock;
	private String stockMinimo;
	private Date fechaActualizacion;
	private boolean estado;
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
