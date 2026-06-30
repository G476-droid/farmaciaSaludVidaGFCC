package com.uisrael.farmaciagfcc.aplicacion.casosuso.impl;

import java.util.List;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IClientesUseCase;
import com.uisrael.farmaciagfcc.dominio.entidades.Clientes;
import com.uisrael.farmaciagfcc.dominio.repositorio.IClientesRepositorio;

public class ClientesUseCaseImpl implements IClientesUseCase{
	
	private final IClientesRepositorio clientesRepositorio;

	public ClientesUseCaseImpl(IClientesRepositorio repositorio) {
		this.clientesRepositorio = repositorio;
	}

	@Override
	public Clientes guardar(Clientes nuevoClientes) {
		// TODO Auto-generated method stub
		return clientesRepositorio.guardar(nuevoClientes);
	}

	@Override
	public Clientes buscarPorId(int idClientes) {
		// TODO Auto-generated method stub
		return clientesRepositorio.buscarPorId(idClientes).orElseThrow(()-> new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<Clientes> listarTodos() {
		// TODO Auto-generated method stub
		return clientesRepositorio.listarTodos();
	}

	@Override
	public void eliminar(int idClientes) {
		// TODO Auto-generated method stub
		clientesRepositorio.eliminar(idClientes);
	}

}
