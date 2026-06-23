package com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name="inventario")
public class inventarioEntity {
	
	
	@Id
	private int idInventario;
	private String stock;
	private String stockMinimo;
	private Date fechaActualizacion;
	private boolean estado;
	

}
