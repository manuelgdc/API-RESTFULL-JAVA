package com.example.demo.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Clientes;
import com.example.demo.model.MClientes;

@Component("convertidor")
public class Convertidor {
	public List<MClientes> convertirLista(List<Clientes> clientes){
		List<MClientes> mclientes=new ArrayList<>();
		for(Clientes client: clientes) {
			mclientes.add(new MClientes(client));
		}
		return mclientes;
	}
}
