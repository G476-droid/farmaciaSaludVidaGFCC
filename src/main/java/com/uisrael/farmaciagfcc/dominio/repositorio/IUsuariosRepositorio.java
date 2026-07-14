package com.uisrael.farmaciagfcc.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Usuarios;

public interface IUsuariosRepositorio {
	
	Usuarios guardar(Usuarios nuevoUsuarios);

    Optional<Usuarios> buscarPorId(int idUsuarios);

    List<Usuarios> listarTodos();

    void eliminar(int idUsuarios);

}
