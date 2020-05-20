package com.curso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.entities.Pagamento;
import com.curso.repositories.PagamentoRepository;

@Service
public class PagamentoService {

	@Autowired
	private PagamentoRepository repository;
	
	public List<Pagamento> findAll() {
		return repository.findAll();
	}
	
	public Pagamento findById(Long id) {
		java.util.Optional<Pagamento> obj = repository.findById(id);
		return obj.get();
	}
	
}
