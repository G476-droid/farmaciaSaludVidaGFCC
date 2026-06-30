package com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Categorias;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.CategoriasEntity;

@Mapper(componentModel = "spring")
public interface ICategoriasJpaMapper {

    Categorias toDomain(CategoriasEntity entity);

    CategoriasEntity toEntity(Categorias categoriasPojo);
}