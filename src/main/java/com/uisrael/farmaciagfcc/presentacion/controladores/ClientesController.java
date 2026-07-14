package com.uisrael.farmaciagfcc.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IClientesUseCase;
import com.uisrael.farmaciagfcc.presentacion.dto.request.ClientesRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.ClientesResponseDto;
import com.uisrael.farmaciagfcc.presentacion.mapeadores.IClientesDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/clientes")
public class ClientesController {

    private final IClientesUseCase clientesUseCase;
    private final IClientesDtoMapper mapper;

    public ClientesController(IClientesUseCase clientesUseCase, IClientesDtoMapper mapper) {
        this.clientesUseCase = clientesUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClientesResponseDto guardar(@Valid @RequestBody ClientesRequestDto clientesRequestDto) {
        return mapper.toResponseDto(clientesUseCase.guardar(mapper.toDomain(clientesRequestDto)));
    }

    @GetMapping("/{idClientes}")
    public ClientesResponseDto buscarPorId(@PathVariable int idClientes) {
        return mapper.toResponseDto(clientesUseCase.buscarPorId(idClientes));
    }

    @GetMapping
    public List<ClientesResponseDto> listarTodo() {
        return clientesUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
    }

    @DeleteMapping("/{idClientes}")
    public ResponseEntity<Void> eliminar(@PathVariable int idClientes) {
        clientesUseCase.eliminar(idClientes);
        return ResponseEntity.noContent().build();
    }
}