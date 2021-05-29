package com.config.boot;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.config.boot.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	//This method provides hints to JPA to find a method that searches with username
	Optional<User> findByUserName(String userName);
		
}
