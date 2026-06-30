package com.uisrael.farmaciagfcc.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Rutas;
import com.uisrael.farmaciagfcc.presentacion.dto.request.RutasRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.RutasResponseDto;

@Mapper(componentModel = "spring")
public interface IRutasDtoMapper {

    Rutas toDomain(RutasRequestDto dto);

    RutasResponseDto toResponseDto(Rutas rutasPojo);
}