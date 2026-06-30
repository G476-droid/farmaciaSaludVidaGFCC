package com.uisrael.farmaciagfcc.aplicacion.casosuso.impl;

import java.util.List;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IFarmaciasUseCase;
import com.uisrael.farmaciagfcc.dominio.entidades.Farmacias;
import com.uisrael.farmaciagfcc.dominio.repositorio.IFarmaciasRepositorio;

public class FarmaciasUseCaseImpl implements IFarmaciasUseCase {
	
	private final IFarmaciasRepositorio farmaciasRepositorio;

	public FarmaciasUseCaseImpl(IFarmaciasRepositorio repositorio) {
		this.farmaciasRepositorio = repositorio;
	}

	@Override
	public Farmacias guardar(Farmacias nuevoFarmacias) {
		// TODO Auto-generated method stub
		return farmaciasRepositorio.guardar(nuevoFarmacias);
	}

	@Override
	public Farmacias buscarPorId(int idFarmacias) {
		// TODO Auto-generated method stub
		return farmaciasRepositorio.buscarPorId(idFarmacias).orElseThrow(()-> new RuntimeException("Farmacias no encontrado"));
	}

	@Override
	public List<Farmacias> listarTodos() {
		// TODO Auto-generated method stub
		return farmaciasRepositorio.listarTodos();
	}

	@Override
	public void eliminar(int idFarmacias) {
		// TODO Auto-generated method stub
		farmaciasRepositorio.eliminar(idFarmacias);
	}

}
