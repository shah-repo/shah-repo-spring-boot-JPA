package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.services.StudentService;
import com.example.view.StudentRequest;
import com.example.view.StudentResponse;

@RestController
public class RoutesController {

	@Autowired
	private StudentService service;

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello Mr Shah Fahed";
	}

	@GetMapping("student-list")
	public List<Student> getStudentList() {
		return service.getStudentList();
	}

	@GetMapping("student-details/{id}")
	public StudentResponse getStudentDetails(@PathVariable Long id) {
		return service.getStudentDetails(id);
	}

	@PostMapping("studentList")
	public void addStudent(@RequestBody StudentRequest request) {
		service.addStudent(request);
	}

	@PutMapping("updateDetails")
	public String updateStudentDetails(@RequestBody Student student) {
		return service.updateStudentDetails(student);
	}

	@DeleteMapping("deleteStudent/{id}")
	public void deleteDetails(@PathVariable Long id) {
		service.deleteStudentData(id);
	}

}
