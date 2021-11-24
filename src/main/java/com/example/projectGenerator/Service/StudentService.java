package com.example.projectGenerator.Service;

import java.util.List;

import com.example.projectGenerator.entity.Student;

public interface StudentService {

	public Student saveStudent(Student student);

	public List<Student> getStudentList();

	public Student getStudent(String uid);

}
