package com.student.service;

import java.util.List;

import com.student.entity.Project;
import com.student.entity.Student;

public interface ProjectService 
{
	public String saveProject(Project project);
	public Student getProjectById(Integer id);
	public List<Project> getALlProjects();

}
