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
@Table(name="categorias")
public class CategoriasEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_categoria")
	private int idCategoria;
	private String nombre;
	private String descripcion;
	
	
	//categoria -- productos
	@OneToMany(mappedBy = "fkCategoriaEntity")
	private List<ProductosEntity> productos = new ArrayList<>();
}
