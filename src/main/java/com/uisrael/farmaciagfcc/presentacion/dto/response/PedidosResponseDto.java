package com.uisrael.farmaciagfcc.presentacion.dto.response;

import java.time.LocalDate;

public class PedidosResponseDto {
	
	private int idPedidos;
	//private int idCliente;
	//private int idFarmacia;
	private LocalDate fechaPedido;
	private boolean estadoRegistro;
	private String total;
	public int getIdPedidos() {
		return idPedidos;
	}
	public void setIdPedidos(int idPedidos) {
		this.idPedidos = idPedidos;
	}
	public LocalDate getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(LocalDate fechaPedido) {
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
