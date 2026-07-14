package com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.PersonalDistribucion;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.PersonalDistribucionEntity;

@Mapper(componentModel = "spring")
public interface IPersonalDistribucionJpaMapper {

    PersonalDistribucion toDomain(PersonalDistribucionEntity entity);

    PersonalDistribucionEntity toEntity(PersonalDistribucion personalDistribucionPojo);
}