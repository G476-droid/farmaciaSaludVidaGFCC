package com.uisrael.farmaciagfcc.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UsuariosRequestDto {
	@NotBlank
	private String nombre;
	@NotBlank
	private String correo;
	@NotBlank
	private String password;
	//private int idRol;
	private Boolean estado;

}
