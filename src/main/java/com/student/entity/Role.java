package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
public class Role 
{
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ERole getName() {
		return name;
	}

	public void setName(ERole name) {
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	
	@Enumerated(EnumType.STRING)
	private ERole name;
	
	public Role()
	{
		
	}
	
	public Role(ERole name)
	{
		this.name=name;
	}
	
  
}
