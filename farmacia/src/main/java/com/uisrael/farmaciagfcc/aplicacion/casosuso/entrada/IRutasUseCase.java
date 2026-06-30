package com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada;

import java.util.List;

import com.uisrael.farmaciagfcc.dominio.entidades.Rutas;

public interface IRutasUseCase {
	
	Rutas guardar(Rutas nuevoRutas);

	Rutas buscarPorId(int idRutas);

    List<Rutas> listarTodos();

    void eliminar(int idRutas);

}
