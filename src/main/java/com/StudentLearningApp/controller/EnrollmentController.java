package com.StudentLearningApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.StudentLearningApp.dto.EnrollmentDto;
import com.StudentLearningApp.dto.EnrollmentRequest;
import com.StudentLearningApp.dto.EnrollmentStatusDto;
import com.StudentLearningApp.entity.Course;
import com.StudentLearningApp.entity.Enrollment;
import com.StudentLearningApp.entity.Users;
import com.StudentLearningApp.service.EnrollmentService;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
@CrossOrigin(origins = " http://localhost:3000")
public class EnrollmentController {

	@Autowired
	private EnrollmentService service;
	
	

	// enroll a user in course//

	@PostMapping("/enroll")
	public Enrollment enrollUser(@RequestBody EnrollmentRequest enrollmentRequest) {
		
		return service.enrollUser(enrollmentRequest);

	

	}

	// get enrollment by user//

	@GetMapping("/user/{userId}")
	public List<Course> getUserEnrollments(@PathVariable Long userId) {
		return service.getUserEnrollments(userId);

	}

	// get enrollment by course//

	@GetMapping("/course/{courseId}")
	public List<EnrollmentDto> getCourseEnrollments(@PathVariable Long courseId) {
		return service.getCourseEnrollments(courseId);
	}
	
	
	// get stats
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping("admin/enrollment/stats")
	public EnrollmentStatusDto enrollstats()
	{
		return service.enrollstats();
		
	}
	
	

	@GetMapping("/admin/viewAllEnroll")
	@PreAuthorize("hasAuthority('ADMIN')")
	public List<EnrollmentDto> getAllEnrollments()
	{
		return service.getAllEnrollments();
	}
	
	// admin can cancel enrollment //
	@DeleteMapping("/admin/cancel/{Id}")
	@PreAuthorize("hasAuthority('ADMIN')")
	public String cancelEnrollment( @PathVariable Long Id)
	{
	        service.cancelEnrollment(Id);
		 return "Enrollment Cancel Successfully ";
	}
	

}
