package com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Usuarios;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.UsuariosEntity;

@Mapper(componentModel = "spring")
public interface IUsuariosJpaMapper {

    Usuarios toDomain(UsuariosEntity entity);

    UsuariosEntity toEntity(Usuarios usuariosPojo);
}