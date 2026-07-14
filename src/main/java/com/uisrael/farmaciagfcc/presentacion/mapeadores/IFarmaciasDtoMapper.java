package com.uisrael.farmaciagfcc.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Farmacias;
import com.uisrael.farmaciagfcc.presentacion.dto.request.FarmaciasRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.FarmaciasResponseDto;

@Mapper(componentModel = "spring")
public interface IFarmaciasDtoMapper {

    Farmacias toDomain(FarmaciasRequestDto dto);

    FarmaciasResponseDto toResponseDto(Farmacias farmaciasPojo);
}