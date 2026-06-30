package com.uisrael.farmaciagfcc.aplicacion.casosuso.impl;

import java.util.List;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.ICategoriasUseCase;
import com.uisrael.farmaciagfcc.dominio.entidades.Categorias;
import com.uisrael.farmaciagfcc.dominio.repositorio.ICategoriasRepositorio;

public class CategoriasUseCaseImpl implements ICategoriasUseCase{
	
	private final ICategoriasRepositorio categoriasRepositorio;

	public CategoriasUseCaseImpl(ICategoriasRepositorio repositorio) {
		this.categoriasRepositorio = repositorio;
	}

	@Override
	public Categorias guardar(Categorias nuevoCategorias) {
		// TODO Auto-generated method stub
		return categoriasRepositorio.guardar(nuevoCategorias);
	}
	
	@Override
	public Categorias buscarPorId(int idCategorias) {
		// TODO Auto-generated method stub
		return categoriasRepositorio.buscarPorId(idCategorias).orElseThrow(()-> new RuntimeException("Categoria no encontrado"));
	}

	@Override
	public List<Categorias> listarTodos() {
		// TODO Auto-generated method stub
		return categoriasRepositorio.listarTodos();
	}

	@Override
	public void eliminar(int idCategorias) {
		categoriasRepositorio.eliminar(idCategorias);
		
	}

}
