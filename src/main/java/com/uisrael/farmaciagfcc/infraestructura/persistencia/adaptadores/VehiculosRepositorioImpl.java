package com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Vehiculos;
import com.uisrael.farmaciagfcc.dominio.repositorio.IVehiculosRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.VehiculosEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IVehiculosJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IVehiculosJpaRepositorio;

public class VehiculosRepositorioImpl implements IVehiculosRepositorio {

	private final IVehiculosJpaRepositorio jpaRepositorio;
	private final IVehiculosJpaMapper entityMapper;

	public VehiculosRepositorioImpl(IVehiculosJpaRepositorio jpaRepositorio, IVehiculosJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Vehiculos guardar(Vehiculos nuevoVehiculos) {
		VehiculosEntity entity = entityMapper.toEntity(nuevoVehiculos);
		VehiculosEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Vehiculos> buscarPorId(int idVehiculos) {
		return jpaRepositorio.findById(idVehiculos).map(entityMapper::toDomain);
	}

	@Override
	public List<Vehiculos> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idVehiculos) {
		jpaRepositorio.deleteById(idVehiculos);
	}
}