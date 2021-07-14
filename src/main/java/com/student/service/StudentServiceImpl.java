package com.student.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Project;
import com.student.entity.Student;
import com.student.reositpry.ProjectRepo;
import com.student.reositpry.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
    private StudentRepo repo;
	@Autowired
    private ProjectRepo rep;
	@Override
	public Student saveStudent(Student student) 
	{
		return repo.save(student);
	}

	@Override
	public List<Student> getALlStudents()
	{
		return repo.findAll();
		
	}

	@Override
	public Student getStudentById(Integer id) {
		
		Optional<Student> findById = repo.findById(id);
		if(findById.isPresent())
		{
			return findById.get();
		}
		else
			return null;
	}

}
