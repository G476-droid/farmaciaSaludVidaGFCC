package com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Rutas;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.RutasEntity;

@Mapper(componentModel = "spring")
public interface IRutasJpaMapper {

    Rutas toDomain(RutasEntity entity);

    RutasEntity toEntity(Rutas rutasPojo);
}