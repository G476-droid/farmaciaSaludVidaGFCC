package com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="farmacias")
public class FarmaciasEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_farmacia")
	private int idFarmacia;
	private String nombre;
	private String direccion;
	private String zona;
	private String telefono;
	private boolean estado;
	
	// farmacia -- inventario
	@OneToMany(mappedBy = "fkFarmaciaEntity")
	private List<InventarioEntity> inventarios = new ArrayList<>();
	
	// farmcia -- pedidos
	@OneToMany(mappedBy = "fkFarmaciaEntity")
	private List<PedidosEntity> pedidos = new ArrayList<>();
	
	
}
