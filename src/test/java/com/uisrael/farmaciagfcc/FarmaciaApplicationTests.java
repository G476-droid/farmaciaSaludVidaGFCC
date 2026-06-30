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
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IClientesJpaRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IFarmaciasJpaRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IInventariosJpaRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IPedidosJpaRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IProductosJpaRepositorio;

@SpringBootTest
class FarmaciaApplicationTests {
	
	@Autowired
	IClientesJpaRepositorio reposClientes;
	@Autowired
	IFarmaciasJpaRepositorio reposFarmacias;
	@Autowired
	IInventariosJpaRepositorio reposInventarios;
	@Autowired
	IPedidosJpaRepositorio reposPedidos; 
	@Autowired
	IProductosJpaRepositorio reposProductos; 

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
