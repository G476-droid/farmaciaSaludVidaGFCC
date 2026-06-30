package com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Pedidos;
import com.uisrael.farmaciagfcc.dominio.repositorio.IPedidosRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.PedidosEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IPedidosJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IPedidosJpaRepositorio;

public class PedidosRepositorioImpl implements IPedidosRepositorio {

	private final IPedidosJpaRepositorio jpaRepositorio;
	private final IPedidosJpaMapper entityMapper;

	public PedidosRepositorioImpl(IPedidosJpaRepositorio jpaRepositorio, IPedidosJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Pedidos guardar(Pedidos nuevoPedidos) {
		PedidosEntity entity = entityMapper.toEntity(nuevoPedidos);
		PedidosEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Pedidos> buscarPorId(int idPedidos) {
		return jpaRepositorio.findById(idPedidos).map(entityMapper::toDomain);
	}

	@Override
	public List<Pedidos> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idPedidos) {
		jpaRepositorio.deleteById(idPedidos);
	}
}