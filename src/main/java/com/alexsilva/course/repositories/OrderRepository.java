package com.alexsilva.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsilva.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
