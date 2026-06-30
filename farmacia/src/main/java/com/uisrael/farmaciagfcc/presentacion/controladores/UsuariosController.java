package com.uisrael.farmaciagfcc.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IUsuariosUseCase;
import com.uisrael.farmaciagfcc.presentacion.dto.request.UsuariosRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.UsuariosResponseDto;
import com.uisrael.farmaciagfcc.presentacion.mapeadores.IUsuariosDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/usuarios")
public class UsuariosController {

    private final IUsuariosUseCase usuariosUseCase;
    private final IUsuariosDtoMapper mapper;

    public UsuariosController(IUsuariosUseCase usuariosUseCase, IUsuariosDtoMapper mapper) {
        this.usuariosUseCase = usuariosUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuariosResponseDto guardar(@Valid @RequestBody UsuariosRequestDto usuariosRequestDto) {
        return mapper.toResponseDto(usuariosUseCase.guardar(mapper.toDomain(usuariosRequestDto)));
    }

    @GetMapping("/{idUsuarios}")
    public UsuariosResponseDto buscarPorId(@PathVariable int idUsuarios) {
        return mapper.toResponseDto(usuariosUseCase.buscarPorId(idUsuarios));
    }

    @GetMapping
    public List<UsuariosResponseDto> listarTodo() {
        return usuariosUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
    }

    @DeleteMapping("/{idUsuarios}")
    public ResponseEntity<Void> eliminar(@PathVariable int idUsuarios) {
        usuariosUseCase.eliminar(idUsuarios);
        return ResponseEntity.noContent().build();
    }
}