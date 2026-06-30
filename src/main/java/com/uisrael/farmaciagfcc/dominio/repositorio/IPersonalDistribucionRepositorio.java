package com.uisrael.farmaciagfcc.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.PersonalDistribucion;

public interface IPersonalDistribucionRepositorio {
	
	PersonalDistribucion guardar(PersonalDistribucion nuevoPersonalDistribucion);

    Optional<PersonalDistribucion> buscarPorId(int idPersonalDistribucion);

    List<PersonalDistribucion> listarTodos();

    void eliminar(int idPersonalDistribucion);

}
