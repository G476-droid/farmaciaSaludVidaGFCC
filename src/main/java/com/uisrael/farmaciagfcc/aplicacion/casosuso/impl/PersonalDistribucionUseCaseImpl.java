package com.uisrael.farmaciagfcc.aplicacion.casosuso.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IPersonalDistribucionUseCase;
import com.uisrael.farmaciagfcc.dominio.entidades.PersonalDistribucion;
import com.uisrael.farmaciagfcc.dominio.repositorio.IPersonalDistribucionRepositorio;

@Service
public class PersonalDistribucionUseCaseImpl implements IPersonalDistribucionUseCase {

    private final IPersonalDistribucionRepositorio personalDistribucionRepositorio;

    public PersonalDistribucionUseCaseImpl(IPersonalDistribucionRepositorio repositorio) {
        this.personalDistribucionRepositorio = repositorio;
    }

    @Override
    public PersonalDistribucion guardar(PersonalDistribucion nuevoPersonalDistribucion) {
        return personalDistribucionRepositorio.guardar(nuevoPersonalDistribucion);
    }

    @Override
    public PersonalDistribucion buscarPorId(int idPersonalDistribucion) {
        return personalDistribucionRepositorio.buscarPorId(idPersonalDistribucion)
                .orElseThrow(() -> new RuntimeException("Personal de distribución no encontrado"));
    }

    @Override
    public List<PersonalDistribucion> listarTodos() {
        return personalDistribucionRepositorio.listarTodos();
    }

    @Override
    public void eliminar(int idPersonalDistribucion) {
        personalDistribucionRepositorio.eliminar(idPersonalDistribucion);
    }
}