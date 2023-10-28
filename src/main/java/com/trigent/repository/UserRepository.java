package com.trigent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trigent.entity.Role;
import com.trigent.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Role findRoleByName(String string);

	

	

}
