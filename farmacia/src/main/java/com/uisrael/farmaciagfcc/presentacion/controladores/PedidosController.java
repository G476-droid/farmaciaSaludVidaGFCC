package com.uisrael.farmaciagfcc.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IPedidosUseCase;
import com.uisrael.farmaciagfcc.presentacion.dto.request.PedidosRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.PedidosResponseDto;
import com.uisrael.farmaciagfcc.presentacion.mapeadores.IPedidosDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/pedidos")
public class PedidosController {

    private final IPedidosUseCase pedidosUseCase;
    private final IPedidosDtoMapper mapper;

    public PedidosController(IPedidosUseCase pedidosUseCase, IPedidosDtoMapper mapper) {
        this.pedidosUseCase = pedidosUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PedidosResponseDto guardar(@Valid @RequestBody PedidosRequestDto pedidosRequestDto) {
        return mapper.toResponseDto(pedidosUseCase.guardar(mapper.toDomain(pedidosRequestDto)));
    }

    @GetMapping("/{idPedidos}")
    public PedidosResponseDto buscarPorId(@PathVariable int idPedidos) {
        return mapper.toResponseDto(pedidosUseCase.buscarPorId(idPedidos));
    }

    @GetMapping
    public List<PedidosResponseDto> listarTodo() {
        return pedidosUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
    }

    @DeleteMapping("/{idPedidos}")
    public ResponseEntity<Void> eliminar(@PathVariable int idPedidos) {
        pedidosUseCase.eliminar(idPedidos);
        return ResponseEntity.noContent().build();
    }
}