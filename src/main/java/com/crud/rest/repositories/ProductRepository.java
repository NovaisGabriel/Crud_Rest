package com.crud.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.rest.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
