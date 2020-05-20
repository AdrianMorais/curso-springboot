package com.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
