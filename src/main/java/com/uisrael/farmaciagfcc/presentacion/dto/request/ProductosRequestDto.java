package com.uisrael.farmaciagfcc.presentacion.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProductosRequestDto {
	@NotBlank
	private String nombre;
	@NotBlank
	private String descripcion;
	@NotBlank
	private String tipoProducto;
	@NotBlank
	private String precio;
	private LocalDate fechaVencimiento;
	//private int idCategoria;
	//private int idLaboratorio;
	private Boolean estadoRegistro;

}
