package com.uisrael.farmaciagfcc.dominio.entidades;

public class PersonalDistribucion {
	
	private int idPersonal;
	private String nombre;
	private String cedula;
	private String telefono;
	private Boolean estado;
	
	public PersonalDistribucion(int idPersonal, String nombre, String cedula, String telefono, Boolean estado) {
		this.idPersonal = idPersonal;
		this.nombre = nombre;
		this.cedula = cedula;
		this.telefono = telefono;
		this.estado = estado;
	}

	public PersonalDistribucion() {
	}

	public int getIdPersonal() {
		return idPersonal;
	}

	public void setIdPersonal(int idPersonal) {
		this.idPersonal = idPersonal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	

}
