package com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Inventarios;
import com.uisrael.farmaciagfcc.dominio.repositorio.IInventariosRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.InventarioEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IInventariosJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IInventariosJpaRepositorio;

public class InventariosRepositorioImpl implements IInventariosRepositorio {

	private final IInventariosJpaRepositorio jpaRepositorio;
	private final IInventariosJpaMapper entityMapper;

	public InventariosRepositorioImpl(IInventariosJpaRepositorio jpaRepositorio, IInventariosJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Inventarios guardar(Inventarios nuevoInventarios) {
		InventarioEntity entity = entityMapper.toEntity(nuevoInventarios);
		InventarioEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Inventarios> buscarPorId(int idInventarios) {
		return jpaRepositorio.findById(idInventarios).map(entityMapper::toDomain);
	}

	@Override
	public List<Inventarios> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idInventarios) {
		jpaRepositorio.deleteById(idInventarios);
	}
}