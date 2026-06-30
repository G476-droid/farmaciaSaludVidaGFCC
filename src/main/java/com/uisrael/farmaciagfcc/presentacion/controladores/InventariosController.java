package com.uisrael.farmaciagfcc.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IInventariosUseCase;
import com.uisrael.farmaciagfcc.presentacion.dto.request.InventariosRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.InventariosResponseDto;
import com.uisrael.farmaciagfcc.presentacion.mapeadores.IInventariosDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/inventarios")
public class InventariosController {

    private final IInventariosUseCase inventariosUseCase;
    private final IInventariosDtoMapper mapper;

    public InventariosController(IInventariosUseCase inventariosUseCase, IInventariosDtoMapper mapper) {
        this.inventariosUseCase = inventariosUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public InventariosResponseDto guardar(@Valid @RequestBody InventariosRequestDto inventariosRequestDto) {
        return mapper.toResponseDto(inventariosUseCase.guardar(mapper.toDomain(inventariosRequestDto)));
    }

    @GetMapping("/{idInventarios}")
    public InventariosResponseDto buscarPorId(@PathVariable int idInventarios) {
        return mapper.toResponseDto(inventariosUseCase.buscarPorId(idInventarios));
    }

    @GetMapping
    public List<InventariosResponseDto> listarTodo() {
        return inventariosUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
    }

    @DeleteMapping("/{idInventarios}")
    public ResponseEntity<Void> eliminar(@PathVariable int idInventarios) {
        inventariosUseCase.eliminar(idInventarios);
        return ResponseEntity.noContent().build();
    }
}