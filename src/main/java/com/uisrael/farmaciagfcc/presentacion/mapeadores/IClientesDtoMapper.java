package com.uisrael.farmaciagfcc.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Clientes;
import com.uisrael.farmaciagfcc.presentacion.dto.request.ClientesRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.ClientesResponseDto;

@Mapper(componentModel = "spring")
public interface IClientesDtoMapper {

    Clientes toDomain(ClientesRequestDto dto);

    ClientesResponseDto toResponseDto(Clientes clientesPojo);
}