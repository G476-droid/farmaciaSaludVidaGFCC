package com.uisrael.farmaciagfcc.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LaboratoriosRequestDto {
	@NotBlank
	private String nombre;
	@NotBlank
	private String ruc;
	@NotBlank
	private String telefono;
	@NotBlank
	private String Direccion;

}
