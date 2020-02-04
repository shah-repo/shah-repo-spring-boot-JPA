package com.example.view;

import com.example.entity.Student;

public class StudentRequest {

	public String name;
	public Long id;
	public String mobile;

	public Student toEntity() {

		Student student = new Student();
		student.setName(this.getName());
		student.setId(this.getId());
		student.setMobile(this.getMobile());

		return student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
