package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Clientes;
import com.example.demo.model.MClientes;
import com.example.demo.service.ClientesServices;

@RestController
@RequestMapping("/v1")
public class ClientesController {
	
	@Autowired
	@Qualifier("servicio")
	ClientesServices service;
	
	@PutMapping("/cliente")
	public boolean agregarCliente(@RequestBody @Valid Clientes cliente) {
		return service.crear(cliente);
	}
	
	@PostMapping("/cliente")
	public boolean actualizarCliente(@RequestBody @Valid Clientes cliente){
		return service.actualizar(cliente);
	}
	
	@DeleteMapping("/cliente/{id}/{nombre}")
	public boolean borrarCliente(@PathVariable("id") int id,@PathVariable("nombre") String nombre) {
		return service.borrar(nombre, id);
	}
	
	@GetMapping("/cliente")
	public List<MClientes> obtenerClientes(){
		return service.obtener();
	}
}
