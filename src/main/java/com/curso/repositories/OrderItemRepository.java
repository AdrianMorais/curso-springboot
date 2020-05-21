package com.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
