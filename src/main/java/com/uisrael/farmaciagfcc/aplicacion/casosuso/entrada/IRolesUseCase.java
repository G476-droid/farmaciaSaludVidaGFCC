package com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada;

import java.util.List;

import com.uisrael.farmaciagfcc.dominio.entidades.Roles;

public interface IRolesUseCase {
	
	Roles guardar(Roles nuevoRoles);

	Roles buscarPorId(int idRoles);

    List<Roles> listarTodos();

    void eliminar(int idRoles);

}
