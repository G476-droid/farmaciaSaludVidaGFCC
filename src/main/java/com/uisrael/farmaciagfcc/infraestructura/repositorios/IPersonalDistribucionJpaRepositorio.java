package com.uisrael.farmaciagfcc.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.PersonalDistribucionEntity;

public interface IPersonalDistribucionJpaRepositorio extends JpaRepository<PersonalDistribucionEntity, Integer> {

}
