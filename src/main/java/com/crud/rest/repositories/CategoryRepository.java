package com.crud.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.rest.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
