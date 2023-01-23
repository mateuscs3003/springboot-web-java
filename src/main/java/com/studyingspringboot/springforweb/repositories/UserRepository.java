package com.studyingspringboot.springforweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studyingspringboot.springforweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
