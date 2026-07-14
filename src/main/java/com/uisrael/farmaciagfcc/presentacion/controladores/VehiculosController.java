package com.uisrael.farmaciagfcc.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IVehiculosUseCase;
import com.uisrael.farmaciagfcc.presentacion.dto.request.VehiculosRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.VehiculosResponseDto;
import com.uisrael.farmaciagfcc.presentacion.mapeadores.IVehiculosDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculosController {

    private final IVehiculosUseCase vehiculosUseCase;
    private final IVehiculosDtoMapper mapper;

    public VehiculosController(IVehiculosUseCase vehiculosUseCase, IVehiculosDtoMapper mapper) {
        this.vehiculosUseCase = vehiculosUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VehiculosResponseDto guardar(@Valid @RequestBody VehiculosRequestDto vehiculosRequestDto) {
        return mapper.toResponseDto(vehiculosUseCase.guardar(mapper.toDomain(vehiculosRequestDto)));
    }

    @GetMapping("/{idVehiculos}")
    public VehiculosResponseDto buscarPorId(@PathVariable int idVehiculos) {
        return mapper.toResponseDto(vehiculosUseCase.buscarPorId(idVehiculos));
    }

    @GetMapping
    public List<VehiculosResponseDto> listarTodo() {
        return vehiculosUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
    }

    @DeleteMapping("/{idVehiculos}")
    public ResponseEntity<Void> eliminar(@PathVariable int idVehiculos) {
        vehiculosUseCase.eliminar(idVehiculos);
        return ResponseEntity.noContent().build();
    }
}