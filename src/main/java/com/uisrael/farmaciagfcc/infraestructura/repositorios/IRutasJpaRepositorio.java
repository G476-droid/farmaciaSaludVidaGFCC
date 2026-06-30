package com.uisrael.farmaciagfcc.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.RutasEntity;

public interface IRutasJpaRepositorio extends JpaRepository<RutasEntity, Integer>{

}
