package com.studyingspringboot.springforweb.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.studyingspringboot.springforweb.entities.Category;
import com.studyingspringboot.springforweb.entities.Order;
import com.studyingspringboot.springforweb.entities.OrderItem;
import com.studyingspringboot.springforweb.entities.Product;
import com.studyingspringboot.springforweb.entities.User;
import com.studyingspringboot.springforweb.entities.enums.OrderStatus;
import com.studyingspringboot.springforweb.repositories.CategoryRepository;
import com.studyingspringboot.springforweb.repositories.OrderItemRepository;
import com.studyingspringboot.springforweb.repositories.OrderRepository;
import com.studyingspringboot.springforweb.repositories.ProductRepository;
import com.studyingspringboot.springforweb.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Other");
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, ""); 
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, ""); 
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, ""); 
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, ""); 
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
				
		User u1 = new User(null, "Toninho", "toninho@email.com",  "99999", "1233");
		
		Order o1 = new Order(null, Instant.parse("2023-01-20T19:53:07Z"), OrderStatus.PAID, u1);
		
		OrderItem oi1 = new OrderItem(o1, p2, 2, p2.getPrice());
		
		userRepository.saveAll(Arrays.asList(u1));
		orderRepository.saveAll(Arrays.asList(o1));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		p1.getCategories().add(cat2);
		p2.getCategories().add(cat1);
		p2.getCategories().add(cat3);
		
		productRepository.saveAll(Arrays.asList(p1, p2));
		
		orderItemRepository.saveAll(Arrays.asList(oi1));
		
	}
	
	
}
