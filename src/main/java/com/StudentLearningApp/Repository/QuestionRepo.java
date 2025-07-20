package com.StudentLearningApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentLearningApp.entity.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Long> {
	

}
