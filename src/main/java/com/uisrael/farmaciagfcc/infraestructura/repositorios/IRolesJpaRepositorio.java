package com.uisrael.farmaciagfcc.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.RolesEntity;

public interface IRolesJpaRepositorio extends JpaRepository<RolesEntity, Integer>{

}
