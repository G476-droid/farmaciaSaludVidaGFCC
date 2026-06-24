package com.uisrael.farmaciagfcc;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.ClientesEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.FarmaciasEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.InventarioEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.PedidosEntity;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.jpa.ProductosEntity;
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
					
		ClientesEntity nuevo = new ClientesEntity();
		nuevo.setNombre("Fernanda");
		nuevo.setApellido("Cumbicos");
		nuevo.setCedula("123456543");
		nuevo.setCorreo("fer@gmail.com");
		nuevo.setTelefono("0976456787");
		nuevo.setDireccion("Loja");
		nuevo.setEstado(true);
		reposClientes.save(nuevo);
		
		
		FarmaciasEntity nuevaFarmacia = new FarmaciasEntity();
		nuevaFarmacia.setNombre("Fybeca");
		nuevaFarmacia.setDireccion("Nueva Loja");
		nuevaFarmacia.setZona("Loja");
		nuevaFarmacia.setTelefono("097564543");	
		nuevaFarmacia.setEstado(true);
		reposFarmacias.save(nuevaFarmacia);	
		
		
		InventarioEntity nuevaInventario = new InventarioEntity();
		nuevaInventario.setStock("34");
		nuevaInventario.setStockMinimo("5");
		nuevaInventario.setEstado(true);
		reposInventarios.save(nuevaInventario);	
		
		
		PedidosEntity nuevaPedidos = new PedidosEntity();
		nuevaPedidos.setEstadoRegistro(true);
		nuevaPedidos.setTotal("200");
		reposPedidos.save(nuevaPedidos);

		
		ProductosEntity nuevaProductos = new ProductosEntity();
		nuevaProductos.setNombre("Finalin");
		nuevaProductos.setDescripcion("200 Finalin");
		nuevaProductos.setTipoProducto("Pastilla");
		nuevaProductos.setPrecio("123,00");
		nuevaProductos.setEstadoRegistro(true);
		reposProductos.save(nuevaProductos);
	}

}
