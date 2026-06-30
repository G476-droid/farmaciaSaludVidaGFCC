package com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Pedidos;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.PedidosEntity;

@Mapper(componentModel = "spring")
public interface IPedidosJpaMapper {

    Pedidos toDomain(PedidosEntity entity);

    PedidosEntity toEntity(Pedidos pedidosPojo);
}