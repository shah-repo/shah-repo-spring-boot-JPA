package com.example.view;

import com.example.entity.Student;

public class StudentResponse {

	public String name;
	public String mobile;
	public Long id;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StudentResponse() {
	}

	public StudentResponse(Student student) {
		this.name = student.getName();
		this.id = student.getId();
		this.mobile = student.getMobile();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
