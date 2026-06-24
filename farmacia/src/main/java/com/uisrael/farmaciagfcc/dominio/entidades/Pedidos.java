package com.uisrael.farmaciagfcc.dominio.entidades;

import java.util.Date;

public class Pedidos {
	
	private int idPedidos;
	private Date fechaPedido;
	private boolean estadoRegistro;
	private String total;
	public Pedidos(int idPedidos, Date fechaPedido, boolean estadoRegistro, String total) {
		this.idPedidos = idPedidos;
		this.fechaPedido = fechaPedido;
		this.estadoRegistro = estadoRegistro;
		this.total = total;
	}
	public Pedidos() {
	}
	public int getIdPedidos() {
		return idPedidos;
	}
	public void setIdPedidos(int idPedidos) {
		this.idPedidos = idPedidos;
	}
	public Date getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public boolean isEstadoRegistro() {
		return estadoRegistro;
	}
	public void setEstadoRegistro(boolean estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	
	

}
