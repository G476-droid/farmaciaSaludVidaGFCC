package com.uisrael.farmaciagfcc.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Roles;

public interface IRolesRepositorio {
	
	Roles guardar(Roles nuevoRoles);

    Optional<Roles> buscarPorId(int idRoles);

    List<Roles> listarTodos();

    void eliminar(int idRoles);

}
