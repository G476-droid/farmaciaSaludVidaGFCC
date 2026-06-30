package com.uisrael.farmaciagfcc.presentacion.dto.request;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class InventariosRequestDto {

	// private int idFarmacia;
	// private int idProducto;
	@NotBlank
	private String stock;
	@NotBlank
	private String stockMinimo;
	private Date fechaActualizacion;
	private boolean estado;

}
