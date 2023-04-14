package com.alexsilva.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsilva.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
