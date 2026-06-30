package com.uisrael.farmaciagfcc.aplicacion.casosuso.impl;

import java.util.List;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IInventariosUseCase;
import com.uisrael.farmaciagfcc.dominio.entidades.Inventarios;
import com.uisrael.farmaciagfcc.dominio.repositorio.IInventariosRepositorio;

public class InventariosUseCaseImpl implements IInventariosUseCase {
	
	private final IInventariosRepositorio inventariosRepositorio;

	public InventariosUseCaseImpl(IInventariosRepositorio repositorio) {
		this.inventariosRepositorio = repositorio;
}

	@Override
	public Inventarios guardar(Inventarios nuevoInventarios) {
		// TODO Auto-generated method stub
		return inventariosRepositorio.guardar(nuevoInventarios);
	}

	@Override
	public Inventarios buscarPorId(int idInventarios) {
		// TODO Auto-generated method stub
		return inventariosRepositorio.buscarPorId(idInventarios).orElseThrow(()-> new RuntimeException("Inventarios no encontrado"));
	}

	@Override
	public List<Inventarios> listarTodos() {
		// TODO Auto-generated method stub
		return inventariosRepositorio.listarTodos();
	}

	@Override
	public void eliminar(int idInventarios) {
		// TODO Auto-generated method stub
		inventariosRepositorio.eliminar(idInventarios);
	}
	
}
