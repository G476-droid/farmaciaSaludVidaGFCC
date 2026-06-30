package com.uisrael.farmaciagfcc.aplicacion.casosuso.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IRolesUseCase;
import com.uisrael.farmaciagfcc.dominio.entidades.Roles;
import com.uisrael.farmaciagfcc.dominio.repositorio.IRolesRepositorio;

@Service
public class RolesUseCaseImpl implements IRolesUseCase {

    private final IRolesRepositorio rolesRepositorio;

    public RolesUseCaseImpl(IRolesRepositorio repositorio) {
        this.rolesRepositorio = repositorio;
    }

    @Override
    public Roles guardar(Roles nuevoRoles) {
        return rolesRepositorio.guardar(nuevoRoles);
    }

    @Override
    public Roles buscarPorId(int idRoles) {
        return rolesRepositorio.buscarPorId(idRoles)
                .orElseThrow(() -> new RuntimeException("Roles no encontrado"));
    }

    @Override
    public List<Roles> listarTodos() {
        return rolesRepositorio.listarTodos();
    }

    @Override
    public void eliminar(int idRoles) {
        rolesRepositorio.eliminar(idRoles);
    }
}