package com.uisrael.farmaciagfcc.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Usuarios;
import com.uisrael.farmaciagfcc.presentacion.dto.request.UsuariosRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.UsuariosResponseDto;

@Mapper(componentModel = "spring")
public interface IUsuariosDtoMapper {

    Usuarios toDomain(UsuariosRequestDto dto);

    UsuariosResponseDto toResponseDto(Usuarios usuariosPojo);
}