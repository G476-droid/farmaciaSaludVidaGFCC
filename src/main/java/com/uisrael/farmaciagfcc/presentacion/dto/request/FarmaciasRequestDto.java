package com.uisrael.farmaciagfcc.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class FarmaciasRequestDto {
	@NotBlank
	private String nombre;
	@NotBlank
	private String direccion;
	@NotBlank
	private String zona;
	@NotBlank
	private String telefono;
	private boolean estado;

}
