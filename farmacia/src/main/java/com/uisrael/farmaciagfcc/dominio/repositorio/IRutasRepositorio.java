package com.uisrael.farmaciagfcc.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Rutas;

public interface IRutasRepositorio {
	
	Rutas guardar(Rutas nuevoRutas);

    Optional<Rutas> buscarPorId(int idRutas);

    List<Rutas> listarTodos();

    void eliminar(int idRutas);

}
