package com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="clientes")
public class clientesEntity {
	@Id
	private int idCliente;
	private String nombre;
	private String apellido;
	private String cedula;
	private String correo;
	private String telefono;
	private String direccion;
	private boolean estado;
	
	
	
	

}
