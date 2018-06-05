package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="CLIENTES")
@Entity
public class Clientes implements Serializable {
	@GeneratedValue
	@Id
	@Column(name="ID_CLIENTES")
	private int id;
	
	@Column(name="NOMBRES")
	private String nombre;
	
	@Column(name="ASIGNATURA")
	private String asignatura;
	
	@Column(name="NOTA")
	private int nota;

	public Clientes(int id, String nombre, String asignatura, int nota) {
		
		this.id = id;
		this.nombre = nombre;
		this.asignatura = asignatura;
		this.nota = nota;
	}
	
	public Clientes() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
}
