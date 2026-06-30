package com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Usuarios;
import com.uisrael.farmaciagfcc.dominio.repositorio.IUsuariosRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.UsuariosEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IUsuariosJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IUsuarioJpaRepositorio;

public class UsuariosRepositorioImpl implements IUsuariosRepositorio {

	private final IUsuarioJpaRepositorio jpaRepositorio;
	private final IUsuariosJpaMapper entityMapper;

	public UsuariosRepositorioImpl(IUsuarioJpaRepositorio jpaRepositorio, IUsuariosJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Usuarios guardar(Usuarios nuevoUsuarios) {
		UsuariosEntity entity = entityMapper.toEntity(nuevoUsuarios);
		UsuariosEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Usuarios> buscarPorId(int idUsuarios) {
		return jpaRepositorio.findById(idUsuarios).map(entityMapper::toDomain);
	}

	@Override
	public List<Usuarios> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idUsuarios) {
		jpaRepositorio.deleteById(idUsuarios);
	}
}