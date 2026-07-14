package com.uisrael.farmaciagfcc.presentacion.dto.response;

import java.time.LocalDate;

public class ProductosResponseDto {
	
	private int idProducto;
	private String nombre;
	private String descripcion;
	private String tipoProducto;
	private String precio;
	private LocalDate fechaVencimiento;
	//private int idCategoria;
	//private int idLaboratorio;
	private Boolean estadoRegistro;
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
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public Boolean getEstadoRegistro() {
		return estadoRegistro;
	}
	public void setEstadoRegistro(Boolean estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}
	
	

}
