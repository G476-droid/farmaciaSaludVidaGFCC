package com.uisrael.farmaciagfcc.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Laboratorios;

public interface ILaboratoriosRepositorio {
	
	Laboratorios guardar(Laboratorios nuevoLaboratorios);

    Optional<Laboratorios> buscarPorId(int idLaboratorios);

    List<Laboratorios> listarTodos();

    void eliminar(int idLaboratorios);

}
