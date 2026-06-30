package com.uisrael.farmaciagfcc.aplicacion.casosuso.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IProductosUseCase;
import com.uisrael.farmaciagfcc.dominio.entidades.Productos;
import com.uisrael.farmaciagfcc.dominio.repositorio.IProductosRepositorio;

@Service
public class ProductosUseCaseImpl implements IProductosUseCase {

    private final IProductosRepositorio productosRepositorio;

    public ProductosUseCaseImpl(IProductosRepositorio repositorio) {
        this.productosRepositorio = repositorio;
    }

    @Override
    public Productos guardar(Productos nuevoProductos) {
        return productosRepositorio.guardar(nuevoProductos);
    }

    @Override
    public Productos buscarPorId(int idProductos) {
        return productosRepositorio.buscarPorId(idProductos)
                .orElseThrow(() -> new RuntimeException("Productos no encontrado"));
    }

    @Override
    public List<Productos> listarTodos() {
        return productosRepositorio.listarTodos();
    }

    @Override
    public void eliminar(int idProductos) {
        productosRepositorio.eliminar(idProductos);
    }
}