package com.student.service;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.student.entity.Role;
import com.student.entity.User;

public class UserDetailsImpl implements UserDetails
{
	
	private static final long serialVersionUID = -4900755222829181197L;
	private User user;
	private Integer id;
	private String username;
	private String email;
	@JsonIgnore
	private String password;
	
	public UserDetailsImpl(User user)
	{
		this.user=user;
	}
	@Override
    public Collection<? extends GrantedAuthority> getAuthorities()
	{
		 Set<Role> roles = user.getRoles();
		 List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		 for (Role role : roles)
		 {
	            authorities.add(new SimpleGrantedAuthority(role.getName().name()));
	     }
        return authorities;
    }
		
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
	public Integer getId()
	{
		return id;
	}
	public String getEmail()
	{
		return email;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj)
		{
			return true;
		}
		if(obj==null||getClass()!=obj.getClass())
			return false;
		UserDetailsImpl user=(UserDetailsImpl)obj;
		return Objects.equals(id,user.id);
	}
	

}
