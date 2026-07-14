package com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Laboratorios;
import com.uisrael.farmaciagfcc.dominio.repositorio.ILaboratoriosRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.LaboratoriosEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.ILaboratoriosJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.ILaboratorioJpaRepositorio;

public class LaboratoriosRepositorioImpl implements ILaboratoriosRepositorio {

    private final ILaboratorioJpaRepositorio jpaRepositorio;
    private final ILaboratoriosJpaMapper entityMapper;

    public LaboratoriosRepositorioImpl(ILaboratorioJpaRepositorio jpaRepositorio, ILaboratoriosJpaMapper entityMapper) {
        this.jpaRepositorio = jpaRepositorio;
        this.entityMapper = entityMapper;
    }

    @Override
    public Laboratorios guardar(Laboratorios nuevoLaboratorios) {
        LaboratoriosEntity entity = entityMapper.toEntity(nuevoLaboratorios);
        LaboratoriosEntity guardado = jpaRepositorio.save(entity);
        return entityMapper.toDomain(guardado);
    }

    @Override
    public Optional<Laboratorios> buscarPorId(int idLaboratorios) {
        return jpaRepositorio.findById(idLaboratorios).map(entityMapper::toDomain);
    }

    @Override
    public List<Laboratorios> listarTodos() {
        return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
    }

    @Override
    public void eliminar(int idLaboratorios) {
        jpaRepositorio.deleteById(idLaboratorios);
    }
}