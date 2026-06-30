package com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.PersonalDistribucion;
import com.uisrael.farmaciagfcc.dominio.repositorio.IPersonalDistribucionRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.PersonalDistribucionEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IPersonalDistribucionJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IPersonalDistribucionJpaRepositorio;

public class PersonalDistribucionRepositorioImpl implements IPersonalDistribucionRepositorio {

	private final IPersonalDistribucionJpaRepositorio jpaRepositorio;
	private final IPersonalDistribucionJpaMapper entityMapper;

	public PersonalDistribucionRepositorioImpl(IPersonalDistribucionJpaRepositorio jpaRepositorio,
			IPersonalDistribucionJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public PersonalDistribucion guardar(PersonalDistribucion nuevoPersonalDistribucion) {
		PersonalDistribucionEntity entity = entityMapper.toEntity(nuevoPersonalDistribucion);
		PersonalDistribucionEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<PersonalDistribucion> buscarPorId(int idPersonalDistribucion) {
		return jpaRepositorio.findById(idPersonalDistribucion).map(entityMapper::toDomain);
	}

	@Override
	public List<PersonalDistribucion> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idPersonalDistribucion) {
		jpaRepositorio.deleteById(idPersonalDistribucion);
	}
}