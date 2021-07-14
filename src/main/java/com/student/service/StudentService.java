package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService 
{
	public Student saveStudent(Student student);
	public List<Student> getALlStudents();
	public Student getStudentById(Integer id);

}
