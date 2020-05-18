package com.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.entities.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {

}
