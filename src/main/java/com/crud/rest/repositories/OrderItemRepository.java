package com.crud.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.rest.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
