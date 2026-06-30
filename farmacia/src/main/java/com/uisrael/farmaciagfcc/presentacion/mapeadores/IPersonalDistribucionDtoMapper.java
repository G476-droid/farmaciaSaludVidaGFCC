package com.uisrael.farmaciagfcc.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.PersonalDistribucion;
import com.uisrael.farmaciagfcc.presentacion.dto.request.PersonalDistribucionRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.PersonalDistribucionResponseDto;

@Mapper(componentModel = "spring")
public interface IPersonalDistribucionDtoMapper {

    PersonalDistribucion toDomain(PersonalDistribucionRequestDto dto);

    PersonalDistribucionResponseDto toResponseDto(PersonalDistribucion personalDistribucionPojo);
}