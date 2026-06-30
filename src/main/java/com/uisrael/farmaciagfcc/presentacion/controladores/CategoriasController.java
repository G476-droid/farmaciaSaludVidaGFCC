package com.uisrael.farmaciagfcc.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.ICategoriasUseCase;
import com.uisrael.farmaciagfcc.presentacion.dto.request.CategoriasRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.CategoriasResponseDto;
import com.uisrael.farmaciagfcc.presentacion.mapeadores.ICategoriasDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/categorias")
public class CategoriasController {

    private final ICategoriasUseCase categoriasUseCase;
    private final ICategoriasDtoMapper mapper;

    public CategoriasController(ICategoriasUseCase categoriasUseCase, ICategoriasDtoMapper mapper) {
        this.categoriasUseCase = categoriasUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoriasResponseDto guardar(@Valid @RequestBody CategoriasRequestDto categoriasRequestDto) {
        return mapper.toResponseDto(categoriasUseCase.guardar(mapper.toDomain(categoriasRequestDto)));
    }

    @GetMapping("/{idCategorias}")
    public CategoriasResponseDto buscarPorId(@PathVariable int idCategorias) {
        return mapper.toResponseDto(categoriasUseCase.buscarPorId(idCategorias));
    }

    @GetMapping
    public List<CategoriasResponseDto> listarTodo() {
        return categoriasUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
    }

    @DeleteMapping("/{idCategorias}")
    public ResponseEntity<Void> eliminar(@PathVariable int idCategorias) {
        categoriasUseCase.eliminar(idCategorias);
        return ResponseEntity.noContent().build();
    }
}