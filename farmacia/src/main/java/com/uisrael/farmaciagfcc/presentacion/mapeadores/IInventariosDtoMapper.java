package com.uisrael.farmaciagfcc.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Inventarios;
import com.uisrael.farmaciagfcc.presentacion.dto.request.InventariosRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.InventariosResponseDto;

@Mapper(componentModel = "spring")
public interface IInventariosDtoMapper {

    Inventarios toDomain(InventariosRequestDto dto);

    InventariosResponseDto toResponseDto(Inventarios inventariosPojo);
}