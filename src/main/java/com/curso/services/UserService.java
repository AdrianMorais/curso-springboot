package com.curso.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.entities.Usuario;
import com.curso.repositories.UserRepository;
import com.curso.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<Usuario> findAll() {
		return repository.findAll();
	}
	
	public Usuario findById(Long id) {
		java.util.Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Usuario insert(Usuario obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Usuario update(Long id, Usuario obj) {
		Usuario entidade = repository.getOne(id);
		updateData(entidade, obj);
		return repository.save(entidade);
	}
	
	public void updateData(Usuario entidade, Usuario obj) {
		try {
			entidade.setNome(obj.getNome());
			entidade.setEmail(obj.getEmail());
			entidade.setTelefone(obj.getSenha());
			
		}catch(EntityNotFoundException e) {
			e.getMessage();
		}
	}
	
}
