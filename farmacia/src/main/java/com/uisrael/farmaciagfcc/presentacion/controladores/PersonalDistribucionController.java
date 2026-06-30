package com.uisrael.farmaciagfcc.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IPersonalDistribucionUseCase;
import com.uisrael.farmaciagfcc.presentacion.dto.request.PersonalDistribucionRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.PersonalDistribucionResponseDto;
import com.uisrael.farmaciagfcc.presentacion.mapeadores.IPersonalDistribucionDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/personal-distribucion")
public class PersonalDistribucionController {

    private final IPersonalDistribucionUseCase personalDistribucionUseCase;
    private final IPersonalDistribucionDtoMapper mapper;

    public PersonalDistribucionController(IPersonalDistribucionUseCase personalDistribucionUseCase,
                                          IPersonalDistribucionDtoMapper mapper) {
        this.personalDistribucionUseCase = personalDistribucionUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PersonalDistribucionResponseDto guardar(@Valid @RequestBody PersonalDistribucionRequestDto personalDistribucionRequestDto) {
        return mapper.toResponseDto(personalDistribucionUseCase.guardar(mapper.toDomain(personalDistribucionRequestDto)));
    }

    @GetMapping("/{idPersonalDistribucion}")
    public PersonalDistribucionResponseDto buscarPorId(@PathVariable int idPersonalDistribucion) {
        return mapper.toResponseDto(personalDistribucionUseCase.buscarPorId(idPersonalDistribucion));
    }

    @GetMapping
    public List<PersonalDistribucionResponseDto> listarTodo() {
        return personalDistribucionUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
    }

    @DeleteMapping("/{idPersonalDistribucion}")
    public ResponseEntity<Void> eliminar(@PathVariable int idPersonalDistribucion) {
        personalDistribucionUseCase.eliminar(idPersonalDistribucion);
        return ResponseEntity.noContent().build();
    }
}