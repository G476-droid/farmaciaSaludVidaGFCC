package com.uisrael.farmaciagfcc.dominio.entidades;

public class Farmacias {
	
	private int idFarmacia;
	private String nombre;
	private String direccion;
	private String zona;
	private String telefono;
	private boolean estado;
	public Farmacias(int idFarmacia, String nombre, String direccion, String zona, String telefono, boolean estado) {
		this.idFarmacia = idFarmacia;
		this.nombre = nombre;
		this.direccion = direccion;
		this.zona = zona;
		this.telefono = telefono;
		this.estado = estado;
	}
	public Farmacias() {
	}
	public int getIdFarmacia() {
		return idFarmacia;
	}
	public void setIdFarmacia(int idFarmacia) {
		this.idFarmacia = idFarmacia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
	

}
