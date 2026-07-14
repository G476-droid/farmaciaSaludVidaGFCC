package com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Vehiculos;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.VehiculosEntity;

@Mapper(componentModel = "spring")
public interface IVehiculosJpaMapper {

    Vehiculos toDomain(VehiculosEntity entity);

    VehiculosEntity toEntity(Vehiculos vehiculosPojo);
}