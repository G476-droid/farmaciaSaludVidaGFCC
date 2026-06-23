package com.uisrael.farmaciagfcc;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.clientesEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.farmaciasEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.inventarioEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.pedidosEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.productosEntity;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IClientesRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IFarmaciasRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IInventariosRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IPedidosRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IProductosRepositorio;

@SpringBootTest
class FarmaciaApplicationTests {
	
	@Autowired
	IClientesRepositorio reposClientes;
	@Autowired
	IFarmaciasRepositorio reposFarmacias;
	@Autowired
	IInventariosRepositorio reposInventarios;
	@Autowired
	IPedidosRepositorio reposPedidos; 
	@Autowired
	IProductosRepositorio reposProductos; 

	@Test
	void contextLoads() {
					
		clientesEntity nuevo = new clientesEntity();
		nuevo.setNombre("Fernanda");
		nuevo.setApellido("Cumbicos");
		nuevo.setCedula("123456543");
		nuevo.setCorreo("fer@gmail.com");
		nuevo.setTelefono("0976456787");
		nuevo.setDireccion("Loja");
		nuevo.setEstado(true);
		reposClientes.save(nuevo);
		
		
		farmaciasEntity nuevaFarmacia = new farmaciasEntity();
		nuevaFarmacia.setNombre("Fybeca");
		nuevaFarmacia.setDireccion("Nueva Loja");
		nuevaFarmacia.setZona("Loja");
		nuevaFarmacia.setTelefono("097564543");	
		nuevaFarmacia.setEstado(true);
		reposFarmacias.save(nuevaFarmacia);	
		
		
		inventarioEntity nuevaInventario = new inventarioEntity();
		nuevaInventario.setStock("34");
		nuevaInventario.setStockMinimo("5");
		nuevaInventario.setEstado(true);
		reposInventarios.save(nuevaInventario);	
		
		
		pedidosEntity nuevaPedidos = new pedidosEntity();
		nuevaPedidos.setEstadoRegistro(true);
		nuevaPedidos.setTotal("200");
		reposPedidos.save(nuevaPedidos);

		
		productosEntity nuevaProductos = new productosEntity();
		nuevaProductos.setNombre("Finalin");
		nuevaProductos.setDescripcion("200 Finalin");
		nuevaProductos.setTipoProducto("Pastilla");
		nuevaProductos.setPrecio("123,00");
		nuevaProductos.setEstadoRegistro(true);
		reposProductos.save(nuevaProductos);
	}

}
