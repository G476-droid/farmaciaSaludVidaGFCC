package com.uisrael.farmaciagfcc.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.farmaciagfcc.dominio.entidades.Vehiculos;

public interface IVehiculosRepositorio {
	
	Vehiculos guardar(Vehiculos nuevoVehiculos);

    Optional<Vehiculos> buscarPorId(int idVehiculos);

    List<Vehiculos> listarTodos();

    void eliminar(int idVehiculos);

}
