package com.crud.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.rest.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
