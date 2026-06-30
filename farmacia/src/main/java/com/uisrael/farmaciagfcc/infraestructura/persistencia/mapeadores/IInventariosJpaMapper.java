package com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Inventarios;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.InventarioEntity;

@Mapper(componentModel = "spring")
public interface IInventariosJpaMapper {

    Inventarios toDomain(InventarioEntity entity);

    InventarioEntity toEntity(Inventarios inventariosPojo);
}