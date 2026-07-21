package com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Clientes;
import com.uisrael.farmaciagfcc.dominio.repositorio.IClientesRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.ClientesEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IClientesJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IClientesJpaRepositorio;

public class ClientesRepositorioImpl implements IClientesRepositorio {

	private final IClientesJpaRepositorio jpaRepositorio;
	private final IClientesJpaMapper entityMapper;

	public ClientesRepositorioImpl(IClientesJpaRepositorio jpaRepositorio, IClientesJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Clientes guardar(Clientes nuevoClientes) {
		ClientesEntity entity = entityMapper.toEntity(nuevoClientes);
		ClientesEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Clientes> buscarPorId(int idClientes) {
		return jpaRepositorio.findById(idClientes).map(entityMapper::toDomain);
	}

	@Override
	public List<Clientes> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idClientes) {
		jpaRepositorio.deleteById(idClientes);
	}
}