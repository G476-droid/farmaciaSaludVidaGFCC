package com.uisrael.farmaciagfcc.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IFarmaciasUseCase;
import com.uisrael.farmaciagfcc.presentacion.dto.request.FarmaciasRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.FarmaciasResponseDto;
import com.uisrael.farmaciagfcc.presentacion.mapeadores.IFarmaciasDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/farmacias")
public class FarmaciasController {

    private final IFarmaciasUseCase farmaciasUseCase;
    private final IFarmaciasDtoMapper mapper;

    public FarmaciasController(IFarmaciasUseCase farmaciasUseCase, IFarmaciasDtoMapper mapper) {
        this.farmaciasUseCase = farmaciasUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FarmaciasResponseDto guardar(@Valid @RequestBody FarmaciasRequestDto farmaciasRequestDto) {
        return mapper.toResponseDto(farmaciasUseCase.guardar(mapper.toDomain(farmaciasRequestDto)));
    }

    @GetMapping("/{idFarmacias}")
    public FarmaciasResponseDto buscarPorId(@PathVariable int idFarmacias) {
        return mapper.toResponseDto(farmaciasUseCase.buscarPorId(idFarmacias));
    }

    @GetMapping
    public List<FarmaciasResponseDto> listarTodo() {
        return farmaciasUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
    }

    @DeleteMapping("/{idFarmacias}")
    public ResponseEntity<Void> eliminar(@PathVariable int idFarmacias) {
        farmaciasUseCase.eliminar(idFarmacias);
        return ResponseEntity.noContent().build();
    }
}