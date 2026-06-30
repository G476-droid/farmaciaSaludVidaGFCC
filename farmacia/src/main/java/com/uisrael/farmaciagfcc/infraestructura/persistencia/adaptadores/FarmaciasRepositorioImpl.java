package com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Farmacias;
import com.uisrael.farmaciagfcc.dominio.repositorio.IFarmaciasRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.FarmaciasEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IFarmaciasJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IFarmaciasJpaRepositorio;

public class FarmaciasRepositorioImpl implements IFarmaciasRepositorio {

    private final IFarmaciasJpaRepositorio jpaRepositorio;
    private final IFarmaciasJpaMapper entityMapper;

    public FarmaciasRepositorioImpl(IFarmaciasJpaRepositorio jpaRepositorio, IFarmaciasJpaMapper entityMapper) {
        this.jpaRepositorio = jpaRepositorio;
        this.entityMapper = entityMapper;
    }

    @Override
    public Farmacias guardar(Farmacias nuevoFarmacias) {
        FarmaciasEntity entity = entityMapper.toEntity(nuevoFarmacias);
        FarmaciasEntity guardado = jpaRepositorio.save(entity);
        return entityMapper.toDomain(guardado);
    }

    @Override
    public Optional<Farmacias> buscarPorId(int idFarmacias) {
        return jpaRepositorio.findById(idFarmacias).map(entityMapper::toDomain);
    }

    @Override
    public List<Farmacias> listarTodos() {
        return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
    }

    @Override
    public void eliminar(int idFarmacias) {
        jpaRepositorio.deleteById(idFarmacias);
    }
}