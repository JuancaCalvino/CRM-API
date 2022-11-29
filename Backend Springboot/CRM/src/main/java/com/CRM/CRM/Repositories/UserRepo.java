package com.CRM.CRM.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRM.CRM.Models.User;

public interface UserRepo extends JpaRepository<User, Integer>{
}
