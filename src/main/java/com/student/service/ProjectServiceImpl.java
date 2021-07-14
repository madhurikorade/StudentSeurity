package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Project;
import com.student.entity.Student;
import com.student.reositpry.ProjectRepo;
import com.student.reositpry.StudentRepo;

@Service
public class ProjectServiceImpl implements ProjectService
{

	@Autowired
    private ProjectRepo repo;
	@Override
	public String saveProject(Project project) 
	{
		
		return null;
	}

	@Override
	public Student getProjectById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> getALlProjects() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	
	
	

}
