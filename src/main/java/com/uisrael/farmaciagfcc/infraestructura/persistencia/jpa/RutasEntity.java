package com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="rutas")
public class RutasEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_ruta")
	private int idRuta;
	//private int idPedido;
	//private int idVehiculo;
	//private int idPersonal;	
	private String origen;
	private String destino;
	private String distancia;
	private Boolean estado;
	private LocalDate fechaAsignacion;

}
