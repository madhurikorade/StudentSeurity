package com.student.reositpry;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Serializable>
{
  
}
