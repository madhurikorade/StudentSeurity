package com.student.reositpry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Project;

public interface ProjectRepo extends JpaRepository<Project,Integer>{

}
