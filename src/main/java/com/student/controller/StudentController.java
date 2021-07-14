package com.student.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Project;
import com.student.entity.Student;
import com.student.reositpry.ProjectRepo;
import com.student.service.ProjectService;
import com.student.service.StudentService;

@RestController
public class StudentController
{
	@Autowired
	private StudentService ser;
	@Autowired
	private ProjectService proser;
	@Autowired
	private ProjectRepo r;
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> findStudentById(@PathVariable int id) 
	{
		Student employeeById = ser.getStudentById(id);
		if(employeeById==null) {
			System.out.println("Student not found");
		}
		return new ResponseEntity<Student>(employeeById,HttpStatus.OK);
	}
	@PostMapping("/addstudent") 
	public ResponseEntity<String> addStudent(@Valid @RequestBody Student s) 
	{	
		Project pro=new Project();
		pro.setStudent(s);
		ser.saveStudent(s);
		return new ResponseEntity<String>("record saved successfully",HttpStatus.CREATED);
	}
	@GetMapping("/GetAllStudents")
	public ResponseEntity<List<Student>> getAllStudents()
	{

		List<Student> student=ser.getALlStudents();
		return new ResponseEntity<List<Student>>(student,HttpStatus.OK);
	}


}
