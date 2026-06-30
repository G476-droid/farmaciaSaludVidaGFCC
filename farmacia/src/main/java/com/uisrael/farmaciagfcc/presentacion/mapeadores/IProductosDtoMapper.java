package com.uisrael.farmaciagfcc.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Productos;
import com.uisrael.farmaciagfcc.presentacion.dto.request.ProductosRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.ProductosResponseDto;

@Mapper(componentModel = "spring")
public interface IProductosDtoMapper {

    Productos toDomain(ProductosRequestDto dto);

    ProductosResponseDto toResponseDto(Productos productosPojo);
}