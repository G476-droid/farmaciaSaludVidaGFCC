package com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="productos")
public class ProductosEntity {
	
	@Id
	private int idProducto;
	private String nombre;
	private String descripcion;
	private String tipoProducto;
	private String precio;
	private Date fechaVencimiento;
	private boolean estadoRegistro;
	

}
