package com.uisrael.farmaciagfcc.aplicacion.casosuso.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IPedidosUseCase;
import com.uisrael.farmaciagfcc.dominio.entidades.Pedidos;
import com.uisrael.farmaciagfcc.dominio.repositorio.IPedidosRepositorio;

@Service
public class PedidosUseCaseImpl implements IPedidosUseCase {

    private final IPedidosRepositorio pedidosRepositorio;

    public PedidosUseCaseImpl(IPedidosRepositorio repositorio) {
        this.pedidosRepositorio = repositorio;
    }

    @Override
    public Pedidos guardar(Pedidos nuevoPedidos) {
        return pedidosRepositorio.guardar(nuevoPedidos);
    }

    @Override
    public Pedidos buscarPorId(int idPedidos) {
        return pedidosRepositorio.buscarPorId(idPedidos)
                .orElseThrow(() -> new RuntimeException("Pedidos no encontrado"));
    }

    @Override
    public List<Pedidos> listarTodos() {
        return pedidosRepositorio.listarTodos();
    }

    @Override
    public void eliminar(int idPedidos) {
        pedidosRepositorio.eliminar(idPedidos);
    }
}