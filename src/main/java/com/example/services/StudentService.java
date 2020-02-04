package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StudentRepo;
import com.example.view.StudentRequest;
import com.example.view.StudentResponse;

@Service
public class StudentService {

	@Autowired
	public StudentRepo repo;

	public List<Student> getStudentList() {
		return repo.findAll();
	}

	public StudentResponse getStudentDetails(Long id) {
		return new StudentResponse(repo.findById(id).get());
	}

	public void addStudent(StudentRequest request) {
		repo.save(request.toEntity());
	}

	public String updateStudentDetails(Student student) {
		repo.save(student);
		return "updated";
	}

	public void deleteStudentData(Long id) {
		repo.deleteById(id);
	}

}
