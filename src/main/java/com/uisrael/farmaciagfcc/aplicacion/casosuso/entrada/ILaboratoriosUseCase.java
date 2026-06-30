package com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada;

import java.util.List;

import com.uisrael.farmaciagfcc.dominio.entidades.Laboratorios;

public interface ILaboratoriosUseCase {
	
	Laboratorios guardar(Laboratorios nuevoLaboratorios);

	Laboratorios buscarPorId(int idLaboratorios);

    List<Laboratorios> listarTodos();

    void eliminar(int idLaboratorios);

}
