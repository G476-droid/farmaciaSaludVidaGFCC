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
@Data
@Entity
@Table(name="usuario")
public class UsuariosEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private int idUsuario;
	private String nombre;
	private String correo;
	private String password;
	//private int idRol;
	private Boolean estado;
	
	// rol --- usuarios

	@ManyToOne
	@JoinColumn(name = "id_rol")
	private RolesEntity fkRolEntity;
}
