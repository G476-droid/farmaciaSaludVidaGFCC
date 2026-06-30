package com.uisrael.farmaciagfcc.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.LaboratoriosEntity;

public interface ILaboratorioJpaRepositorio extends JpaRepository<LaboratoriosEntity, Integer>{

}
