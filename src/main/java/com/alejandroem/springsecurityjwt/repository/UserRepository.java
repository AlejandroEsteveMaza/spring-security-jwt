package com.alejandroem.springsecurityjwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alejandroem.springsecurityjwt.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findfindByUsername(String username);
}
