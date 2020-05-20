package com.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.entities.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
