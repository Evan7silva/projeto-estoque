package com.sistema.projeto.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.projeto.entities.Cliente;

@RestController
@RequestMapping(value = "/clientes") 
public class ClienteResource {

	@GetMapping
	public ResponseEntity<Cliente> findAll(){
		
		Cliente c = new Cliente(1, "Maria", "034.688.699-08", null);
		return ResponseEntity.ok().body(c);
	}
}
