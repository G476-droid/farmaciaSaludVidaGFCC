package com.uisrael.farmaciagfcc.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Pedidos;

public interface IPedidosRepositorio {
	
	Pedidos guardar(Pedidos nuevoPedidos);

    Optional<Pedidos> buscarPorId(int idPedidos);

    List<Pedidos> listarTodos();

    void eliminar(int idPedidos);

}
