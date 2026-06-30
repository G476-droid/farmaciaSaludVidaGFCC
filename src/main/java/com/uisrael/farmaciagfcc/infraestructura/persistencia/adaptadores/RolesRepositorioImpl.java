package com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Roles;
import com.uisrael.farmaciagfcc.dominio.repositorio.IRolesRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.RolesEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IRolesJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IRolesJpaRepositorio;

public class RolesRepositorioImpl implements IRolesRepositorio {

	private final IRolesJpaRepositorio jpaRepositorio;
	private final IRolesJpaMapper entityMapper;

	public RolesRepositorioImpl(IRolesJpaRepositorio jpaRepositorio, IRolesJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Roles guardar(Roles nuevoRoles) {
		RolesEntity entity = entityMapper.toEntity(nuevoRoles);
		RolesEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Roles> buscarPorId(int idRoles) {
		return jpaRepositorio.findById(idRoles).map(entityMapper::toDomain);
	}

	@Override
	public List<Roles> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idRoles) {
		jpaRepositorio.deleteById(idRoles);
	}
}