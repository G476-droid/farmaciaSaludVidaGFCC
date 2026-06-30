package com.uisrael.farmaciagfcc.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PersonalDistribucionRequestDto {
	@NotBlank
	private String nombre;
	@NotBlank
	private String cedula;
	@NotBlank
	private String telefono;
	
	private Boolean estado;

}
