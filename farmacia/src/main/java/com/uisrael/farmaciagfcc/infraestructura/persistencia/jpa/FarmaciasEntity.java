package com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="farmacias")
public class FarmaciasEntity {
	@Id
	private int idFarmacia;
	private String nombre;
	private String direccion;
	private String zona;
	private String telefono;
	private boolean estado;

}
