package com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada;

import java.util.List;

import com.uisrael.farmaciagfcc.dominio.entidades.Usuarios;

public interface IUsuariosUseCase {
	
	Usuarios guardar(Usuarios nuevoUsuarios);

	Usuarios buscarPorId(int idUsuarios);

    List<Usuarios> listarTodos();

    void eliminar(int idUsuarios);

}
