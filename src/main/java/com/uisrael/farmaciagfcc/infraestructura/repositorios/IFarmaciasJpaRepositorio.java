package com.uisrael.farmaciagfcc.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.FarmaciasEntity;

public interface IFarmaciasJpaRepositorio extends JpaRepository<FarmaciasEntity, Integer>{

}
