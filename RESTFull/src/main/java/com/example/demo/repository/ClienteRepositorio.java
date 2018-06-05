package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Clientes;

//se encarga de hacer las peticiones entre la bbdd
@Repository("repositorio")
public interface ClienteRepositorio extends JpaRepository<Clientes,Serializable> {
	
	public abstract Clientes findByNombre(String nombre);
	
	public abstract List<Clientes> findByAsignatura(String asignatura);
	
	//devuelve cleinte con mismo nombre y asignatura
	public abstract Clientes findByNombreAndAsignatura(String nombre, String asignatura);
	
	public abstract Clientes findByNombreAndId(String nombre, int id);
}
