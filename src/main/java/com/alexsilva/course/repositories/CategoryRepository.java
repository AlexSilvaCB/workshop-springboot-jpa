package com.alexsilva.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsilva.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
