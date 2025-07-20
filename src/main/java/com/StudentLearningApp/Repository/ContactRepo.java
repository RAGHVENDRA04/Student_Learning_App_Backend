package com.StudentLearningApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentLearningApp.entity.Contact;

@Repository
public interface ContactRepo  extends JpaRepository<Contact, Long>{

}
