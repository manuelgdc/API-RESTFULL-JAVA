package com.example.demo.service;

import java.util.List;

import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.converter.Convertidor;
import com.example.demo.entity.Clientes;
import com.example.demo.model.MClientes;
import com.example.demo.repository.ClienteRepositorio;
import com.mysql.jdbc.log.Log;

@Service("servicio")
public class ClientesServices {
	@Autowired
	@Qualifier("repositorio")
	private ClienteRepositorio repositorio;
	
	@Autowired
	@Qualifier("convertidor")
	private Convertidor convertidor;
	

	
	public boolean crear(Clientes clientes) {
		
		try {
			repositorio.save(clientes);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public boolean actualizar(Clientes clientes) {
		try {
			repositorio.save(clientes);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	
	public boolean borrar(String nombre, int id) {
		try {
			Clientes cliente=repositorio.findByNombreAndId(nombre, id);
			repositorio.delete(cliente);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public List<MClientes> obtener(){
		
		return convertidor.convertirLista(repositorio.findAll());
	}
	
	public MClientes obtenerPorNombreAsignatura(String nombre, String asignatura) {
		return new MClientes(repositorio.findByNombreAndAsignatura(nombre, asignatura));
	}
	
	public List<MClientes> obtenerAsignatura(String asignatura){
		return convertidor.convertirLista(repositorio.findByAsignatura(asignatura));
	}
	
}
