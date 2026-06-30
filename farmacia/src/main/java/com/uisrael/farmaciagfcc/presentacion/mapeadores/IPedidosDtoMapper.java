package com.uisrael.farmaciagfcc.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Pedidos;
import com.uisrael.farmaciagfcc.presentacion.dto.request.PedidosRequestDto;
import com.uisrael.farmaciagfcc.presentacion.dto.response.PedidosResponseDto;

@Mapper(componentModel = "spring")
public interface IPedidosDtoMapper {

    Pedidos toDomain(PedidosRequestDto dto);

    PedidosResponseDto toResponseDto(Pedidos pedidosPojo);
}