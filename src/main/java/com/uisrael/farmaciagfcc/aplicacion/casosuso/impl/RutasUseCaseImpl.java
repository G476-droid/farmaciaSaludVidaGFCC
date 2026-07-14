package com.uisrael.farmaciagfcc.aplicacion.casosuso.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IRutasUseCase;
import com.uisrael.farmaciagfcc.dominio.entidades.Rutas;
import com.uisrael.farmaciagfcc.dominio.repositorio.IRutasRepositorio;

@Service
public class RutasUseCaseImpl implements IRutasUseCase {

    private final IRutasRepositorio rutasRepositorio;

    public RutasUseCaseImpl(IRutasRepositorio repositorio) {
        this.rutasRepositorio = repositorio;
    }

    @Override
    public Rutas guardar(Rutas nuevoRutas) {
        return rutasRepositorio.guardar(nuevoRutas);
    }

    @Override
    public Rutas buscarPorId(int idRutas) {
        return rutasRepositorio.buscarPorId(idRutas)
                .orElseThrow(() -> new RuntimeException("Rutas no encontrado"));
    }

    @Override
    public List<Rutas> listarTodos() {
        return rutasRepositorio.listarTodos();
    }

    @Override
    public void eliminar(int idRutas) {
        rutasRepositorio.eliminar(idRutas);
    }
}