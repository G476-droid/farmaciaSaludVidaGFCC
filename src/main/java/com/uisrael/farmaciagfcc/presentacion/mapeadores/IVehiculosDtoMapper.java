package com.uisrael.farmaciagfcc.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Vehiculos;
import com.uisrael.farmaciagfcc.presentacion.dto.request.VehiculosRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.VehiculosResponseDto;

@Mapper(componentModel = "spring")
public interface IVehiculosDtoMapper {

    Vehiculos toDomain(VehiculosRequestDto dto);

    VehiculosResponseDto toResponseDto(Vehiculos vehiculosPojo);
}