package com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada;

import java.util.List;

import com.uisrael.farmaciagfcc.dominio.entidades.Inventarios;


public interface IInventariosUseCase {
	
	Inventarios guardar(Inventarios nuevoInventarios);

	Inventarios buscarPorId(int idInventarios);

    List<Inventarios> listarTodos();

    void eliminar(int idInventarios);

}
