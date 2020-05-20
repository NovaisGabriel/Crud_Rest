package com.crud.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.rest.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
