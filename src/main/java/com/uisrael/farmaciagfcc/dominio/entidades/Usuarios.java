package com.uisrael.farmaciagfcc.dominio.entidades;

public class Usuarios {
	
	private int idUsuario;
	private String nombre;
	private String correo;
	private String password;
	//private int idRol;
	private Boolean estado;
	
	public Usuarios(int idUsuario, String nombre, String correo, String password, Boolean estado) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
		this.estado = estado;
	}

	public Usuarios() {
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	

}
