package com.alexsilva.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsilva.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
