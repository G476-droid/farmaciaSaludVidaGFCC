package com.uisrael.farmaciagfcc.aplicacion.casosuso.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.ILaboratoriosUseCase;
import com.uisrael.farmaciagfcc.dominio.entidades.Laboratorios;
import com.uisrael.farmaciagfcc.dominio.repositorio.ILaboratoriosRepositorio;

@Service
public class LaboratoriosUseCaseImpl implements ILaboratoriosUseCase {

    private final ILaboratoriosRepositorio laboratoriosRepositorio;

    public LaboratoriosUseCaseImpl(ILaboratoriosRepositorio repositorio) {
        this.laboratoriosRepositorio = repositorio;
    }

    @Override
    public Laboratorios guardar(Laboratorios nuevoLaboratorios) {
        return laboratoriosRepositorio.guardar(nuevoLaboratorios);
    }

    @Override
    public Laboratorios buscarPorId(int idLaboratorios) {
        return laboratoriosRepositorio.buscarPorId(idLaboratorios)
                .orElseThrow(() -> new RuntimeException("Laboratorios no encontrado"));
    }

    @Override
    public List<Laboratorios> listarTodos() {
        return laboratoriosRepositorio.listarTodos();
    }

    @Override
    public void eliminar(int idLaboratorios) {
        laboratoriosRepositorio.eliminar(idLaboratorios);
    }
}