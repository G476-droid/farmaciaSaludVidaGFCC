package com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.farmaciagfcc.dominio.entidades.Laboratorios;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.LaboratoriosEntity;

@Mapper (componentModel = "spring")
public interface ILaboratoriosJpaMapper {

    Laboratorios toDomain(LaboratoriosEntity entity);

    LaboratoriosEntity toEntity(Laboratorios laboratoriosPojo);
}