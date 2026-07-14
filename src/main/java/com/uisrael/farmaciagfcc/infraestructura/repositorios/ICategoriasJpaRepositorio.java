package com.uisrael.farmaciagfcc.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.CategoriasEntity;

public interface ICategoriasJpaRepositorio extends JpaRepository <CategoriasEntity, Integer> {

}
