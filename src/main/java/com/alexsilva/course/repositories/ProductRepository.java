package com.alexsilva.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsilva.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
