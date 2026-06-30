package com.uisrael.farmaciagfcc.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RolesRequestDto {
	@NotBlank
	private  String nombre;
	@NotBlank
	private  String descripcion;
	

}
