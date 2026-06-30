package com.uisrael.farmaciagfcc.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Farmacias;

public interface IFarmaciasRepositorio {
	
	Farmacias guardar(Farmacias nuevoFarmacias);

    Optional<Farmacias> buscarPorId(int idFarmacias);

    List<Farmacias> listarTodos();

    void eliminar(int idFarmacias);

}
