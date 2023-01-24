package com.studyingspringboot.springforweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studyingspringboot.springforweb.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
	
}
