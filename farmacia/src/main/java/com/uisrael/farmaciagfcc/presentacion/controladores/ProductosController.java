package com.uisrael.farmaciagfcc.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IProductosUseCase;
import com.uisrael.farmaciagfcc.presentacion.dto.request.ProductosRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.ProductosResponseDto;
import com.uisrael.farmaciagfcc.presentacion.mapeadores.IProductosDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/productos")
public class ProductosController {

    private final IProductosUseCase productosUseCase;
    private final IProductosDtoMapper mapper;

    public ProductosController(IProductosUseCase productosUseCase, IProductosDtoMapper mapper) {
        this.productosUseCase = productosUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductosResponseDto guardar(@Valid @RequestBody ProductosRequestDto productosRequestDto) {
        return mapper.toResponseDto(productosUseCase.guardar(mapper.toDomain(productosRequestDto)));
    }

    @GetMapping("/{idProductos}")
    public ProductosResponseDto buscarPorId(@PathVariable int idProductos) {
        return mapper.toResponseDto(productosUseCase.buscarPorId(idProductos));
    }

    @GetMapping
    public List<ProductosResponseDto> listarTodo() {
        return productosUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
    }

    @DeleteMapping("/{idProductos}")
    public ResponseEntity<Void> eliminar(@PathVariable int idProductos) {
        productosUseCase.eliminar(idProductos);
        return ResponseEntity.noContent().build();
    }
}