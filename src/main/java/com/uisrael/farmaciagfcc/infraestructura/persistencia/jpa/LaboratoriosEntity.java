package com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="laboratorio")
public class LaboratoriosEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_laboratorio")
	private int idLaboratorio;
	private String nombre;
	private String ruc;
	private String telefono;
	private String Direccion;

}
