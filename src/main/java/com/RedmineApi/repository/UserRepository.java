package com.RedmineApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.RedmineApi.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
	
	@Query(value = "SELECT count(*) FROM users WHERE login=:login", nativeQuery = true)
	public int userCountCheck(@Param("login") String login);
	
	
	@Query(value = "SELECT * FROM users WHERE login=:login", nativeQuery = true)
	public User userDetails(@Param("login") String login);

}
