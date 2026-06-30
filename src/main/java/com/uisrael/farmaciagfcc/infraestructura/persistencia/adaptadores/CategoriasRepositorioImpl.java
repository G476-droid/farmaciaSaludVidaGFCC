package com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Categorias;
import com.uisrael.farmaciagfcc.dominio.repositorio.ICategoriasRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.CategoriasEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.ICategoriasJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.ICategoriasJpaRepositorio;

public class CategoriasRepositorioImpl implements ICategoriasRepositorio {

    private final ICategoriasJpaRepositorio jpaRepositorio;
    private final ICategoriasJpaMapper entityMapper;

    public CategoriasRepositorioImpl(ICategoriasJpaRepositorio jpaRepositorio, ICategoriasJpaMapper entityMapper) {
        this.jpaRepositorio = jpaRepositorio;
        this.entityMapper = entityMapper;
    }

    @Override
    public Categorias guardar(Categorias nuevoCategorias) {
        CategoriasEntity entity = entityMapper.toEntity(nuevoCategorias);
        CategoriasEntity guardado = jpaRepositorio.save(entity);
        return entityMapper.toDomain(guardado);
    }

    @Override
    public Optional<Categorias> buscarPorId(int idCategorias) {
        return jpaRepositorio.findById(idCategorias).map(entityMapper::toDomain);
    }

    @Override
    public List<Categorias> listarTodos() {
        return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
    }

    @Override
    public void eliminar(int idCategorias) {
        jpaRepositorio.deleteById(idCategorias);
    }
}