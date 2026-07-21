package com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa;

import java.math.BigDecimal;
import java.util.List;

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
@Table(name = "detalle_pedido")
public class DetallePedidoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_detalle")
	private int idDetalle;
	private int cantidad;
	private BigDecimal precionUnitario;
	private BigDecimal subtotal;

	// Muchos detalles pertenecen a un pedido
	@ManyToOne
	@JoinColumn(name = "id_pedido")
	private PedidosEntity fkPedidoEntity;

	// Muchos detalles pertenecen a un producto
	@ManyToOne
	@JoinColumn(name = "id_producto")
	private ProductosEntity fkProductoEntity;

}
