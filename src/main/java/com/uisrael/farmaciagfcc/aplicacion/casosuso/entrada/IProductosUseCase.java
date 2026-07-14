package com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada;

import java.util.List;

import com.uisrael.farmaciagfcc.dominio.entidades.Productos;

public interface IProductosUseCase {
	
	Productos guardar(Productos nuevoProductos);

	Productos buscarPorId(int idProductos);

    List<Productos> listarTodos();

    void eliminar(int idProductos);

}
