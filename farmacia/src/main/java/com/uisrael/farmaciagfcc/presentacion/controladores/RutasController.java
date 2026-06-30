package com.uisrael.farmaciagfcc.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IRutasUseCase;
import com.uisrael.farmaciagfcc.presentacion.dto.request.RutasRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.RutasResponseDto;
import com.uisrael.farmaciagfcc.presentacion.mapeadores.IRutasDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/rutas")
public class RutasController {

    private final IRutasUseCase rutasUseCase;
    private final IRutasDtoMapper mapper;

    public RutasController(IRutasUseCase rutasUseCase, IRutasDtoMapper mapper) {
        this.rutasUseCase = rutasUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RutasResponseDto guardar(@Valid @RequestBody RutasRequestDto rutasRequestDto) {
        return mapper.toResponseDto(rutasUseCase.guardar(mapper.toDomain(rutasRequestDto)));
    }

    @GetMapping("/{idRutas}")
    public RutasResponseDto buscarPorId(@PathVariable int idRutas) {
        return mapper.toResponseDto(rutasUseCase.buscarPorId(idRutas));
    }

    @GetMapping
    public List<RutasResponseDto> listarTodo() {
        return rutasUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
    }

    @DeleteMapping("/{idRutas}")
    public ResponseEntity<Void> eliminar(@PathVariable int idRutas) {
        rutasUseCase.eliminar(idRutas);
        return ResponseEntity.noContent().build();
    }
}