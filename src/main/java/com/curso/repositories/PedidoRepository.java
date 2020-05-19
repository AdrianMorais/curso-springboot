package com.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
