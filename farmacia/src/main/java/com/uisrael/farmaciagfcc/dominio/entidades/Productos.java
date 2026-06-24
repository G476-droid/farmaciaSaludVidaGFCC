package com.uisrael.farmaciagfcc.dominio.entidades;

import java.util.Date;

public class Productos {
	
	private int idProducto;
	private String nombre;
	private String descripcion;
	private String tipoProducto;
	private String precio;
	private Date fechaVencimiento;
	private boolean estadoRegistro;
	public Productos(int idProducto, String nombre, String descripcion, String tipoProducto, String precio,
			Date fechaVencimiento, boolean estadoRegistro) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipoProducto = tipoProducto;
		this.precio = precio;
		this.fechaVencimiento = fechaVencimiento;
		this.estadoRegistro = estadoRegistro;
	}
	public Productos() {
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public boolean isEstadoRegistro() {
		return estadoRegistro;
	}
	public void setEstadoRegistro(boolean estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}
	
	
	
	
	
	

}
