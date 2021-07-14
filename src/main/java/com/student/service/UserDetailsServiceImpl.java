package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.student.entity.User;
import com.student.reositpry.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService
{
	@Autowired
    UserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username)
	{
		User user=repo.findByUsername(username).orElseThrow(()->new UsernameNotFoundException("user not found with name:"+username));
		return new UserDetailsImpl(user);
	}
 
}
