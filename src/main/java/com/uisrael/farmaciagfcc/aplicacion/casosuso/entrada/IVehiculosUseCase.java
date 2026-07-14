package com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada;

import java.util.List;

import com.uisrael.farmaciagfcc.dominio.entidades.Vehiculos;

public interface IVehiculosUseCase {
	
	Vehiculos guardar(Vehiculos nuevoVehiculos);

	Vehiculos buscarPorId(int idPedidos);

    List<Vehiculos> listarTodos();

    void eliminar(int idVehiculos);

}
