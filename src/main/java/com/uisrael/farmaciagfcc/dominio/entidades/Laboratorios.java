package com.uisrael.farmaciagfcc.dominio.entidades;

public class Laboratorios {
	private int idLaboratorio;
	private String nombre;
	private String ruc;
	private String telefono;
	private String Direccion;
	
	
	public Laboratorios(int idLaboratorio, String nombre, String ruc, String telefono, String direccion) {
		this.idLaboratorio = idLaboratorio;
		this.nombre = nombre;
		this.ruc = ruc;
		this.telefono = telefono;
		Direccion = direccion;
	}


	public int getIdLaboratorio() {
		return idLaboratorio;
	}


	public void setIdLaboratorio(int idLaboratorio) {
		this.idLaboratorio = idLaboratorio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRuc() {
		return ruc;
	}


	public void setRuc(String ruc) {
		this.ruc = ruc;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return Direccion;
	}


	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
	
	

}
