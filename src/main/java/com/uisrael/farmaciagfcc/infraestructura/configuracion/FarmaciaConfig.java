package com.uisrael.farmaciagfcc.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.ICategoriasUseCase;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IClientesUseCase;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IFarmaciasUseCase;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IInventariosUseCase;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.ILaboratoriosUseCase;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IPedidosUseCase;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IPersonalDistribucionUseCase;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IProductosUseCase;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IRolesUseCase;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IRutasUseCase;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IUsuariosUseCase;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.entrada.IVehiculosUseCase;

import com.uisrael.farmaciagfcc.aplicacion.casosuso.impl.CategoriasUseCaseImpl;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.impl.ClientesUseCaseImpl;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.impl.FarmaciasUseCaseImpl;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.impl.InventariosUseCaseImpl;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.impl.LaboratoriosUseCaseImpl;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.impl.PedidosUseCaseImpl;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.impl.PersonalDistribucionUseCaseImpl;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.impl.ProductosUseCaseImpl;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.impl.RolesUseCaseImpl;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.impl.RutasUseCaseImpl;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.impl.UsuariosUseCaseImpl;
import com.uisrael.farmaciagfcc.aplicacion.casosuso.impl.VehiculosUseCaseImpl;

import com.uisrael.farmaciagfcc.dominio.repositorio.ICategoriasRepositorio;
import com.uisrael.farmaciagfcc.dominio.repositorio.IClientesRepositorio;
import com.uisrael.farmaciagfcc.dominio.repositorio.IFarmaciasRepositorio;
import com.uisrael.farmaciagfcc.dominio.repositorio.IInventariosRepositorio;
import com.uisrael.farmaciagfcc.dominio.repositorio.ILaboratoriosRepositorio;
import com.uisrael.farmaciagfcc.dominio.repositorio.IPedidosRepositorio;
import com.uisrael.farmaciagfcc.dominio.repositorio.IPersonalDistribucionRepositorio;
import com.uisrael.farmaciagfcc.dominio.repositorio.IProductosRepositorio;
import com.uisrael.farmaciagfcc.dominio.repositorio.IRolesRepositorio;
import com.uisrael.farmaciagfcc.dominio.repositorio.IRutasRepositorio;
import com.uisrael.farmaciagfcc.dominio.repositorio.IUsuariosRepositorio;
import com.uisrael.farmaciagfcc.dominio.repositorio.IVehiculosRepositorio;

import com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores.CategoriasRepositorioImpl;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores.ClientesRepositorioImpl;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores.FarmaciasRepositorioImpl;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores.InventariosRepositorioImpl;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores.LaboratoriosRepositorioImpl;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores.PedidosRepositorioImpl;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores.PersonalDistribucionRepositorioImpl;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores.ProductosRepositorioImpl;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores.RolesRepositorioImpl;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores.RutasRepositorioImpl;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores.UsuariosRepositorioImpl;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.adaptadores.VehiculosRepositorioImpl;

import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.ICategoriasJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IClientesJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IFarmaciasJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IInventariosJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.ILaboratoriosJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IPedidosJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IPersonalDistribucionJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IProductosJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IRolesJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IRutasJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IUsuariosJpaMapper;
import com.uisrael.farmaciagfcc.infraestructura.persistencia.mapeadores.IVehiculosJpaMapper;

import com.uisrael.farmaciagfcc.infraestructura.repositorios.ICategoriasJpaRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IClientesJpaRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IFarmaciasJpaRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IInventariosJpaRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.ILaboratorioJpaRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IPedidosJpaRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IPersonalDistribucionJpaRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IProductosJpaRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IRolesJpaRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IRutasJpaRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IUsuarioJpaRepositorio;
import com.uisrael.farmaciagfcc.infraestructura.repositorios.IVehiculosJpaRepositorio;

@Configuration
public class FarmaciaConfig {

	@Bean
	ICategoriasRepositorio categoriasRepositorio(ICategoriasJpaRepositorio jpaRepositorio, ICategoriasJpaMapper mapper) {
		return new CategoriasRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	ICategoriasUseCase categoriasUseCase(ICategoriasRepositorio repoUseCase) {
		return new CategoriasUseCaseImpl(repoUseCase);
	}

	@Bean
	IClientesRepositorio clientesRepositorio(IClientesJpaRepositorio jpaRepositorio, IClientesJpaMapper mapper) {
		return new ClientesRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IClientesUseCase clientesUseCase(IClientesRepositorio repoUseCase) {
		return new ClientesUseCaseImpl(repoUseCase);
	}

	@Bean
	IFarmaciasRepositorio farmaciasRepositorio(IFarmaciasJpaRepositorio jpaRepositorio, IFarmaciasJpaMapper mapper) {
		return new FarmaciasRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IFarmaciasUseCase farmaciasUseCase(IFarmaciasRepositorio repoUseCase) {
		return new FarmaciasUseCaseImpl(repoUseCase);
	}

	@Bean
	IInventariosRepositorio inventariosRepositorio(IInventariosJpaRepositorio jpaRepositorio, IInventariosJpaMapper mapper) {
		return new InventariosRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IInventariosUseCase inventariosUseCase(IInventariosRepositorio repoUseCase) {
		return new InventariosUseCaseImpl(repoUseCase);
	}

	@Bean
	ILaboratoriosRepositorio laboratoriosRepositorio(ILaboratorioJpaRepositorio jpaRepositorio, ILaboratoriosJpaMapper mapper) {
		return new LaboratoriosRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	ILaboratoriosUseCase laboratoriosUseCase(ILaboratoriosRepositorio repoUseCase) {
		return new LaboratoriosUseCaseImpl(repoUseCase);
	}
	


	@Bean
	IPedidosRepositorio pedidosRepositorio(IPedidosJpaRepositorio jpaRepositorio, IPedidosJpaMapper mapper) {
		return new PedidosRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IPedidosUseCase pedidosUseCase(IPedidosRepositorio repoUseCase) {
		return new PedidosUseCaseImpl(repoUseCase);
	}

	@Bean
	IPersonalDistribucionRepositorio personalDistribucionRepositorio(
			IPersonalDistribucionJpaRepositorio jpaRepositorio,
			IPersonalDistribucionJpaMapper mapper) {
		return new PersonalDistribucionRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IPersonalDistribucionUseCase personalDistribucionUseCase(IPersonalDistribucionRepositorio repoUseCase) {
		return new PersonalDistribucionUseCaseImpl(repoUseCase);
	}

	@Bean
	IProductosRepositorio productosRepositorio(IProductosJpaRepositorio jpaRepositorio, IProductosJpaMapper mapper) {
		return new ProductosRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IProductosUseCase productosUseCase(IProductosRepositorio repoUseCase) {
		return new ProductosUseCaseImpl(repoUseCase);
	}

	@Bean
	IRolesRepositorio rolesRepositorio(IRolesJpaRepositorio jpaRepositorio, IRolesJpaMapper mapper) {
		return new RolesRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IRolesUseCase rolesUseCase(IRolesRepositorio repoUseCase) {
		return new RolesUseCaseImpl(repoUseCase);
	}

	@Bean
	IRutasRepositorio rutasRepositorio(IRutasJpaRepositorio jpaRepositorio, IRutasJpaMapper mapper) {
		return new RutasRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IRutasUseCase rutasUseCase(IRutasRepositorio repoUseCase) {
		return new RutasUseCaseImpl(repoUseCase);
	}

	@Bean
	IUsuariosRepositorio usuariosRepositorio(IUsuarioJpaRepositorio jpaRepositorio, IUsuariosJpaMapper mapper) {
		return new UsuariosRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IUsuariosUseCase usuariosUseCase(IUsuariosRepositorio repoUseCase) {
		return new UsuariosUseCaseImpl(repoUseCase);
	}

	@Bean
	IVehiculosRepositorio vehiculosRepositorio(IVehiculosJpaRepositorio jpaRepositorio, IVehiculosJpaMapper mapper) {
		return new VehiculosRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IVehiculosUseCase vehiculosUseCase(IVehiculosRepositorio repoUseCase) {
		return new VehiculosUseCaseImpl(repoUseCase);
	}
}