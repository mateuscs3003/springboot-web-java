package com.studyingspringboot.springforweb.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.studyingspringboot.springforweb.entities.Order;
import com.studyingspringboot.springforweb.entities.User;
import com.studyingspringboot.springforweb.repositories.OrderRepository;
import com.studyingspringboot.springforweb.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Toninho", "toninho@email.com",  "99999", "1233");
		
		Order o1 = new Order(null, Instant.parse("2023-01-20T19:53:07Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1));
		orderRepository.saveAll(Arrays.asList(o1));
		
	}
	
	
}
