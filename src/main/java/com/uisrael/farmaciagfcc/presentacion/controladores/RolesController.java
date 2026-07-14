package com.uisrael.farmaciagfcc.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IRolesUseCase;
import com.uisrael.farmaciagfcc.presentacion.dto.request.RolesRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.RolesResponseDto;
import com.uisrael.farmaciagfcc.presentacion.mapeadores.IRolesDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/roles")
public class RolesController {

    private final IRolesUseCase rolesUseCase;
    private final IRolesDtoMapper mapper;

    public RolesController(IRolesUseCase rolesUseCase, IRolesDtoMapper mapper) {
        this.rolesUseCase = rolesUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RolesResponseDto guardar(@Valid @RequestBody RolesRequestDto rolesRequestDto) {
        return mapper.toResponseDto(rolesUseCase.guardar(mapper.toDomain(rolesRequestDto)));
    }

    @GetMapping("/{idRoles}")
    public RolesResponseDto buscarPorId(@PathVariable int idRoles) {
        return mapper.toResponseDto(rolesUseCase.buscarPorId(idRoles));
    }

    @GetMapping
    public List<RolesResponseDto> listarTodo() {
        return rolesUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
    }

    @DeleteMapping("/{idRoles}")
    public ResponseEntity<Void> eliminar(@PathVariable int idRoles) {
        rolesUseCase.eliminar(idRoles);
        return ResponseEntity.noContent().build();
    }
}