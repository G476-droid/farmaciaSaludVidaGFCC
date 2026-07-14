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
@Table(name="clientes")
public class ClientesEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private int idCliente;
	private String nombre;
	private String apellido;
	private String cedula;
	private String correo;
	private String telefono;
	private String direccion;
	private boolean estado;
	
	
	// Hola
	// cliente - pedidos
	@OneToMany(mappedBy = "fkClienteEntity")
	private List<PedidosEntity> pedidos = new ArrayList<>();
	

}
