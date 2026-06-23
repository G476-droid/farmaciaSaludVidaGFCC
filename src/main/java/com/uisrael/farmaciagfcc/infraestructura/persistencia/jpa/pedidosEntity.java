package com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="pedidos")
public class pedidosEntity {
	@Id
	private int idPedidos;
	private Date fechaPedido;
	private boolean estadoRegistro;
	private String total;


}
