package com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada;

import java.util.List;

import com.uisrael.farmaciagfcc.dominio.entidades.Pedidos;

public interface IPedidosUseCase {
	
	Pedidos guardar(Pedidos nuevoPedidos);

	Pedidos buscarPorId(int idPedidos);

    List<Pedidos> listarTodos();

    void eliminar(int idPedidos);

}
