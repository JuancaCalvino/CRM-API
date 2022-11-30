package com.CRM.CRM.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.CRM.CRM.Models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	@Query(value = "SELECT DISTINCT u FROM Users u WHERE u.Email = :#{#Email} AND u.Password = :#{#Password}", nativeQuery = true)
	List<User> findByEmailPassword(@Param("Email") String Email, @Param("Password") String Password);

}
