package com.uisrael.farmaciagfcc.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class VehiculosRequestDto {
	@NotBlank
	private String placa;
	@NotBlank
	private String capacidad;
	private Boolean estado;

}
