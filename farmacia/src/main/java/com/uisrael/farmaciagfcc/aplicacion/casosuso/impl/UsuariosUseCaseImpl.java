package com.uisrael.farmaciagfcc.aplicacion.casosuso.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IUsuariosUseCase;
import com.uisrael.farmaciagfcc.dominio.entidades.Usuarios;
import com.uisrael.farmaciagfcc.dominio.repositorio.IUsuariosRepositorio;

@Service
public class UsuariosUseCaseImpl implements IUsuariosUseCase {

    private final IUsuariosRepositorio usuariosRepositorio;

    public UsuariosUseCaseImpl(IUsuariosRepositorio repositorio) {
        this.usuariosRepositorio = repositorio;
    }

    @Override
    public Usuarios guardar(Usuarios nuevoUsuarios) {
        return usuariosRepositorio.guardar(nuevoUsuarios);
    }

    @Override
    public Usuarios buscarPorId(int idUsuarios) {
        return usuariosRepositorio.buscarPorId(idUsuarios)
                .orElseThrow(() -> new RuntimeException("Usuarios no encontrado"));
    }

    @Override
    public List<Usuarios> listarTodos() {
        return usuariosRepositorio.listarTodos();
    }

    @Override
    public void eliminar(int idUsuarios) {
        usuariosRepositorio.eliminar(idUsuarios);
    }
}