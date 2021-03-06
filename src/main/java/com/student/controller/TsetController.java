package com.student.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping("/api/test")
public class TsetController 
{
	@GetMapping("/all")	
	public String allAccess()
	{
      return "public content";
	}
	@GetMapping("/user")
	@PreAuthorize("hasRole('MODERATOR')")
	public String moderatorAccess()
	{
		return "moderator board";
	}
	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess()
	{
		return "Admin Board";
	}
}
