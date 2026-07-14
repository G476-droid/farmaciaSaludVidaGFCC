package com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="productos")
public class ProductosEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private int idProducto;
	private String nombre;
	private String descripcion;
	private String tipoProducto;
	private String precio;
	private Date fechaVencimiento;
	private boolean estadoRegistro;
	
	
	//categoria -- productos
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private CategoriasEntity fkCategoriaEntity;
	
	// laboratorio--productos
	
	@ManyToOne
	@JoinColumn(name = "id_laboratorio")
	private LaboratoriosEntity fkLaboratorioEntity;
	
	// producto con inventario
	
	@OneToMany(mappedBy = "fkProductoEntity")
	private List<InventarioEntity> inventarios = new ArrayList<>();
	
	

}
