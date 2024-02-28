package com.jaybhensdadia.foodorder.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaybhensdadia.foodorder.entities.User;

public interface UserRepo extends JpaRepository<User,Long>{
    Optional<User> findByEmail(String email);
}
