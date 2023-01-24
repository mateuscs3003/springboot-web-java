package com.studyingspringboot.springforweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studyingspringboot.springforweb.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
	
}
