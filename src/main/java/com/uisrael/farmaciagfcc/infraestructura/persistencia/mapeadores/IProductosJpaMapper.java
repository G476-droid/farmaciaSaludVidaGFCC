package com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Productos;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.ProductosEntity;

@Mapper(componentModel = "spring")
public interface IProductosJpaMapper {

    Productos toDomain(ProductosEntity entity);

    ProductosEntity toEntity(Productos productosPojo);
}