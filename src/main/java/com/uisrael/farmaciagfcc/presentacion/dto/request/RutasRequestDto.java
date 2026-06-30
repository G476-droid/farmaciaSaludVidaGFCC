package com.uisrael.farmaciagfcc.presentacion.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RutasRequestDto {

	// private int idPedido;
	// private int idVehiculo;
	// private int idPersonal;
	@NotBlank
	private String origen;
	@NotBlank
	private String destino;
	@NotBlank
	private String distancia;
	private Boolean estado;
	private LocalDate fechaAsignacion;

}
