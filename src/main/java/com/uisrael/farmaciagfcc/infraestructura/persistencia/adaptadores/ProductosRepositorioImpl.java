package com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Productos;
import com.uisrael.farmaciagfcc.dominio.repositorio.IProductosRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.ProductosEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IProductosJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IProductosJpaRepositorio;

public class ProductosRepositorioImpl implements IProductosRepositorio {

    private final IProductosJpaRepositorio jpaRepositorio;
    private final IProductosJpaMapper entityMapper;

    public ProductosRepositorioImpl(IProductosJpaRepositorio jpaRepositorio, IProductosJpaMapper entityMapper) {
        this.jpaRepositorio = jpaRepositorio;
        this.entityMapper = entityMapper;
    }

    @Override
    public Productos guardar(Productos nuevoProductos) {
        ProductosEntity entity = entityMapper.toEntity(nuevoProductos);
        ProductosEntity guardado = jpaRepositorio.save(entity);
        return entityMapper.toDomain(guardado);
    }

    @Override
    public Optional<Productos> buscarPorId(int idProductos) {
        return jpaRepositorio.findById(idProductos).map(entityMapper::toDomain);
    }

    @Override
    public List<Productos> listarTodos() {
        return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
    }

    @Override
    public void eliminar(int idProductos) {
        jpaRepositorio.deleteById(idProductos);
    }
}