package com.uisrael.farmaciagfcc.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Laboratorios;
import com.uisrael.farmaciagfcc.presentacion.dto.request.LaboratoriosRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.LaboratoriosResponseDto;

@Mapper(componentModel = "spring")
public interface ILaboratoriosDtoMapper {

    Laboratorios toDomain(LaboratoriosRequestDto dto);

    LaboratoriosResponseDto toResponseDto(Laboratorios laboratoriosPojo);
}