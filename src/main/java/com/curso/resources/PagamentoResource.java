package com.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entities.Pagamento;
import com.curso.services.PagamentoService;

@RestController
@RequestMapping(name = "/pagamentos")
public class PagamentoResource {

	@Autowired
	private PagamentoService service;
	
	@GetMapping
	public ResponseEntity<List<Pagamento>> findAll() {
		List<Pagamento> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pagamento> findById(@PathVariable Long id) {
		Pagamento obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
