package com.uisrael.farmaciagfcc.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.ILaboratoriosUseCase;
import com.uisrael.farmaciagfcc.presentacion.dto.request.LaboratoriosRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.LaboratoriosResponseDto;
import com.uisrael.farmaciagfcc.presentacion.mapeadores.ILaboratoriosDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/laboratorios")
public class LaboratoriosController {

    private final ILaboratoriosUseCase laboratoriosUseCase;
    private final ILaboratoriosDtoMapper mapper;

    public LaboratoriosController(ILaboratoriosUseCase laboratoriosUseCase, ILaboratoriosDtoMapper mapper) {
        this.laboratoriosUseCase = laboratoriosUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public LaboratoriosResponseDto guardar(@Valid @RequestBody LaboratoriosRequestDto laboratoriosRequestDto) {
        return mapper.toResponseDto(laboratoriosUseCase.guardar(mapper.toDomain(laboratoriosRequestDto)));
    }

    @GetMapping("/{idLaboratorios}")
    public LaboratoriosResponseDto buscarPorId(@PathVariable int idLaboratorios) {
        return mapper.toResponseDto(laboratoriosUseCase.buscarPorId(idLaboratorios));
    }

    @GetMapping
    public List<LaboratoriosResponseDto> listarTodo() {
        return laboratoriosUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
    }

    @DeleteMapping("/{idLaboratorios}")
    public ResponseEntity<Void> eliminar(@PathVariable int idLaboratorios) {
        laboratoriosUseCase.eliminar(idLaboratorios);
        return ResponseEntity.noContent().build();
    }
}