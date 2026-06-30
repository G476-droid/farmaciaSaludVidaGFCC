package com.uisrael.farmaciagfcc.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.UsuariosEntity;

public interface IUsuarioJpaRepositorio extends JpaRepository<UsuariosEntity, Integer> {

}
