package com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada;

import java.util.List;

import com.uisrael.farmaciagfcc.dominio.entidades.Categorias;


public interface ICategoriasUseCase {
	
	Categorias guardar(Categorias nuevoCategorias);

	Categorias buscarPorId(int idCategorias);

    List<Categorias> listarTodos();

    void eliminar(int idCategorias);

}
