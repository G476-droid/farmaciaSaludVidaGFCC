package com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name="inventario")
public class InventarioEntity {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_inventario")
	private int idInventario;
	private String stock;
	private String stockMinimo;
	private Date fechaActualizacion;
	private boolean estado;
	
	
	// farmacia -- inventario
	@ManyToOne
	@JoinColumn(name = "id_farmacia")
	private FarmaciasEntity fkFarmaciaEntity;
	
	
	// producto con inventario
	@ManyToOne
	@JoinColumn(name = "id_producto")
	private ProductosEntity fkProductoEntity;
}
