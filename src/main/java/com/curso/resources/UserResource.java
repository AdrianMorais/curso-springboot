package com.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entities.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UserResource {

	@GetMapping
	public ResponseEntity<Usuario> findAll() {
		Usuario u = new Usuario(1L,"Maria","Maria@gmada.com","9999999","admin");
		return ResponseEntity.ok().body(u);
	}
	
}
