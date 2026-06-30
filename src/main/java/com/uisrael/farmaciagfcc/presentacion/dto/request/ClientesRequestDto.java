package com.uisrael.farmaciagfcc.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ClientesRequestDto {
	
	@NotBlank
	private String nombre;
	@NotBlank
	private String apellido;
	@NotBlank
	private String cedula;
	@NotBlank
	private String correo;
	@NotBlank
	private String telefono;
	@NotBlank
	private String direccion;
	@NotBlank
	private boolean estado;

}
