package com.studyingspringboot.springforweb.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studyingspringboot.springforweb.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> findAll () {
		User user = new User(1L, "Djalma", "email@email.com", "1", "12");
		
		return ResponseEntity.ok().body(user);
	}
}
