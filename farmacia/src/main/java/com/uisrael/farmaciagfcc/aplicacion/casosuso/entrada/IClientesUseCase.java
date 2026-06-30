package com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada;

import java.util.List;

import com.uisrael.farmaciagfcc.dominio.entidades.Clientes;

public interface IClientesUseCase {
	
	Clientes guardar(Clientes nuevoClientes);

	Clientes buscarPorId(int idClientes);

    List<Clientes> listarTodos();

    void eliminar(int idClientes);

}
