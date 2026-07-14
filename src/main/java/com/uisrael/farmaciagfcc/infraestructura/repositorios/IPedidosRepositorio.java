package com.uisrael.farmaciagfcc.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.PedidosEntity;


public interface IPedidosRepositorio extends JpaRepository<PedidosEntity, Integer>{

}
