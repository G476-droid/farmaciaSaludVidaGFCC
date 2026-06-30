package com.uisrael.farmaciagfcc.dominio.entidades;

import java.time.LocalDate;

public class Rutas {
	
	private int idRuta;
	//private int idPedido;
	//private int idVehiculo;
	//private int idPersonal;	
	private String origen;
	private String destino;
	private String distancia;
	private Boolean estado;
	private LocalDate fechaAsignacion;
	
	public Rutas(int idRuta, String origen, String destino, String distancia, Boolean estado,
			LocalDate fechaAsignacion) {
		this.idRuta = idRuta;
		this.origen = origen;
		this.destino = destino;
		this.distancia = distancia;
		this.estado = estado;
		this.fechaAsignacion = fechaAsignacion;
	}

	public Rutas() {
	}

	public int getIdRuta() {
		return idRuta;
	}

	public void setIdRuta(int idRuta) {
		this.idRuta = idRuta;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getDistancia() {
		return distancia;
	}

	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public LocalDate getFechaAsignacion() {
		return fechaAsignacion;
	}

	public void setFechaAsignacion(LocalDate fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}
	

}
