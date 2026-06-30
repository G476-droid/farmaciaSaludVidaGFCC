package com.uisrael.farmaciagfcc.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Categorias;
import com.uisrael.farmaciagfcc.presentacion.dto.request.CategoriasRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.CategoriasResponseDto;

@Mapper(componentModel = "spring")
public interface ICategoriasDtoMapper {

    Categorias toDomain(CategoriasRequestDto dto);

    CategoriasResponseDto toResponseDto(Categorias categoriasPojo);
}