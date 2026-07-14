package com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Roles;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.RolesEntity;

@Mapper(componentModel = "spring")
public interface IRolesJpaMapper {

    Roles toDomain(RolesEntity entity);

    RolesEntity toEntity(Roles rolesPojo);
}