package com.uisrael.farmaciagfcc.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Productos;

public interface IProductosRepositorio {
	
	Productos guardar(Productos nuevoProductos);

    Optional<Productos> buscarPorId(int idProductos);

    List<Productos> listarTodos();

    void eliminar(int idProductos);

}
