package com.example.BookstoreAPI.security;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookstoreAPI.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
