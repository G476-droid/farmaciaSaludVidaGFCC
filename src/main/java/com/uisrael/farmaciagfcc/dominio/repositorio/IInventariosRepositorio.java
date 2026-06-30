package com.uisrael.farmaciagfcc.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Inventarios;

public interface IInventariosRepositorio {
	
	Inventarios guardar(Inventarios nuevoInventarios);

    Optional<Inventarios> buscarPorId(int idInventarios);

    List<Inventarios> listarTodos();

    void eliminar(int idInventarios);

}
