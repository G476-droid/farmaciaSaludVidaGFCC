package com.uisrael.farmaciagfcc.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Clientes;

public interface IClientesRepositorio {
	
	Clientes guardar(Clientes nuevoClientes);

    Optional<Clientes> buscarPorId(int idClientes);

    List<Clientes> listarTodos();

    void eliminar(int idClientes);

}
