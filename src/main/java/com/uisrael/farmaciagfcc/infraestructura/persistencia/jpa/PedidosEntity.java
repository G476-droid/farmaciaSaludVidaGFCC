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
@Table(name="pedidos")
public class PedidosEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_pedido")
	private int idPedidos;
	private Date fechaPedido;
	private boolean estadoRegistro;
	private String total;

	
	// cliente - pedidos
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private ClientesEntity fkClienteEntity;
	
	// farmcia -- pedidos
	@ManyToOne
	@JoinColumn(name = "id_farmacia")
	private FarmaciasEntity fkFarmaciaEntity;
	
	
	// pedido -- rutas
	@OneToMany(mappedBy = "fkPedidoEntity")
	private List<RutasEntity> rutas = new ArrayList<>();
	
}
