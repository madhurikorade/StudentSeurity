package com.student.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer studentId;
	@NotBlank(message = "Student FirstName is Missing")
	@Size(max = 16)
	private String studentFirstName;
	@NotBlank(message = "Student LastName is Missing")
	private String studentLastName;
	@NotBlank(message = "Student EmailAddress is Missing")
	private String studentEmail;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="join_student_project",
	joinColumns = {
			@JoinColumn(name = "student_id")}, 
	inverseJoinColumns = { @JoinColumn(name = "project_id" )})
	private Set<Project> projects=new HashSet<Project>();
	
	public Student(String fname,String lname,String email)
	{
		this.studentFirstName=fname;
		this.studentLastName=lname;
		this.studentEmail=email;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> pr) {
		this.projects = pr;
	}

	
	
}
