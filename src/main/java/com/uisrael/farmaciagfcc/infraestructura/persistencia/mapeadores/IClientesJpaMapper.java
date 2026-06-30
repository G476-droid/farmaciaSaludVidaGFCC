package com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Clientes;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.ClientesEntity;

@Mapper(componentModel = "spring")
public interface IClientesJpaMapper {

    Clientes toDomain(ClientesEntity entity);

    ClientesEntity toEntity(Clientes clientesPojo);
}