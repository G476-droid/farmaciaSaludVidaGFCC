package com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Farmacias;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.FarmaciasEntity;

@Mapper(componentModel = "spring")
public interface IFarmaciasJpaMapper {

    Farmacias toDomain(FarmaciasEntity entity);

    FarmaciasEntity toEntity(Farmacias farmaciasPojo);
}