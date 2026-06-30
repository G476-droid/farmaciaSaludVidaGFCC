package com.uisrael.farmaciagfcc.dominio.entidades;

public class Vehiculos {
	
	private int idVehiculo;
	private String placa;
	private String capacidad;
	private Boolean estado;
	
	public Vehiculos(int idVehiculo, String placa, String capacidad, Boolean estado) {
		this.idVehiculo = idVehiculo;
		this.placa = placa;
		this.capacidad = capacidad;
		this.estado = estado;
	}
	
	public Vehiculos() {
	}
	
	public int getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
}
