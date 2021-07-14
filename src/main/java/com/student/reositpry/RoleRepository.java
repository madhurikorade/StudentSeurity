package com.student.reositpry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.ERole;
import com.student.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>
{
	Optional<Role> findByName(ERole name);
  
}
