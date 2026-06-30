package com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada;

import java.util.List;

import com.uisrael.farmaciagfcc.dominio.entidades.Farmacias;

public interface IFarmaciasUseCase {
	
	Farmacias guardar(Farmacias nuevoFarmacias);

	Farmacias buscarPorId(int idFarmacias);

    List<Farmacias> listarTodos();

    void eliminar(int idFarmacias);

}
