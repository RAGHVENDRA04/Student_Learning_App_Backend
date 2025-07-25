package com.StudentLearningApp.Repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentLearningApp.entity.Course;
import com.StudentLearningApp.entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
	

	Optional<Users> findById(Long userId);
	
	Optional<Users> findByEmail(String email);
	
	boolean existsByEmail(String email);

	
	

}
