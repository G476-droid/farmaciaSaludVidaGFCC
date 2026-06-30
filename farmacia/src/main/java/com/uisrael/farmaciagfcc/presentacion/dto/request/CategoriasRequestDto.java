package com.uisrael.farmaciagfcc.presentacion.dto.request;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CategoriasRequestDto {
	
	
	@NotBlank
	private String nombre;
	@NotBlank
	private String descripcion;

}
