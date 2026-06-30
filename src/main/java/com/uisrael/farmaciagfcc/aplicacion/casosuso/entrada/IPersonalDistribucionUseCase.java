package com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada;

import java.util.List;

import com.uisrael.farmaciagfcc.dominio.entidades.PersonalDistribucion;

public interface IPersonalDistribucionUseCase {
	
	PersonalDistribucion guardar(PersonalDistribucion nuevoPersonalDistribucion);

	PersonalDistribucion buscarPorId(int idPersonalDistribucion);

    List<PersonalDistribucion> listarTodos();

    void eliminar(int idPersonalDistribucion);

}
