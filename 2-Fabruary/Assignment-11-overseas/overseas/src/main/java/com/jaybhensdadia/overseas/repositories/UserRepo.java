package com.jaybhensdadia.overseas.repositories;

import com.jaybhensdadia.overseas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    public  User findByEmail(String email);
}
