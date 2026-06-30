package com.uisrael.farmaciagfcc.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Categorias;

public interface ICategoriasRepositorio {
	
	Categorias guardar(Categorias nuevoCategorias);

    Optional<Categorias> buscarPorId(int idCategorias);

    List<Categorias> listarTodos();

    void eliminar(int idCategorias);

}
