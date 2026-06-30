package com.uisrael.farmaciagfcc.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.VehiculosEntity;

public interface IVehiculosJpaRepositorio extends JpaRepository<VehiculosEntity, Integer>{

}
