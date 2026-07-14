package com.uisrael.farmaciagfcc.aplicacion.casosuso.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IVehiculosUseCase;
import com.uisrael.farmaciagfcc.dominio.entidades.Vehiculos;
import com.uisrael.farmaciagfcc.dominio.repositorio.IVehiculosRepositorio;

@Service
public class VehiculosUseCaseImpl implements IVehiculosUseCase {

    private final IVehiculosRepositorio vehiculosRepositorio;

    public VehiculosUseCaseImpl(IVehiculosRepositorio repositorio) {
        this.vehiculosRepositorio = repositorio;
    }

    @Override
    public Vehiculos guardar(Vehiculos nuevoVehiculos) {
        return vehiculosRepositorio.guardar(nuevoVehiculos);
    }

    @Override
    public Vehiculos buscarPorId(int idVehiculos) {
        return vehiculosRepositorio.buscarPorId(idVehiculos)
                .orElseThrow(() -> new RuntimeException("Vehiculos no encontrado"));
    }

    @Override
    public List<Vehiculos> listarTodos() {
        return vehiculosRepositorio.listarTodos();
    }

    @Override
    public void eliminar(int idVehiculos) {
        vehiculosRepositorio.eliminar(idVehiculos);
    }
}