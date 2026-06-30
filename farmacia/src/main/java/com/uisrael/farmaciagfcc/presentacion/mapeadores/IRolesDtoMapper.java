package com.uisrael.farmaciagfcc.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Roles;
import com.uisrael.farmaciagfcc.presentacion.dto.request.RolesRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.RolesResponseDto;

@Mapper(componentModel = "spring")
public interface IRolesDtoMapper {

    Roles toDomain(RolesRequestDto dto);

    RolesResponseDto toResponseDto(Roles rolesPojo);
}