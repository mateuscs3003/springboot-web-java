package com.studyingspringboot.springforweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studyingspringboot.springforweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
}
