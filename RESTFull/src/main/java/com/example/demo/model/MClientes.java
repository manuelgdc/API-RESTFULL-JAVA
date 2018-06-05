package com.example.demo.model;

import com.example.demo.entity.Clientes;

public class MClientes {

	public MClientes() {

	}

	public MClientes(Clientes clientes) {
		this.id = clientes.getId();
		this.nombre = clientes.getNombre();
		this.asignatura = clientes.getAsignatura();
		this.nota = clientes.getNota();
	}

	public MClientes(int id, String nombre, String asignatura, int nota) {

		this.id = id;
		this.nombre = nombre;
		this.asignatura = asignatura;
		this.nota = nota;
	}

	private int id;
	private String nombre;
	private String asignatura;
	private int nota;

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
