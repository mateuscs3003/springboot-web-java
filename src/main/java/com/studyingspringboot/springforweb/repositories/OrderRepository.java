package com.studyingspringboot.springforweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studyingspringboot.springforweb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
