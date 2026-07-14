package com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Rutas;
import com.uisrael.farmaciagfcc.dominio.repositorio.IRutasRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.RutasEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IRutasJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IRutasJpaRepositorio;

public class RutasRepositorioImpl implements IRutasRepositorio {

	private final IRutasJpaRepositorio jpaRepositorio;
	private final IRutasJpaMapper entityMapper;

	public RutasRepositorioImpl(IRutasJpaRepositorio jpaRepositorio, IRutasJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Rutas guardar(Rutas nuevoRutas) {
		RutasEntity entity = entityMapper.toEntity(nuevoRutas);
		RutasEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Rutas> buscarPorId(int idRutas) {
		return jpaRepositorio.findById(idRutas).map(entityMapper::toDomain);
	}

	@Override
	public List<Rutas> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idRutas) {
		jpaRepositorio.deleteById(idRutas);
	}
}