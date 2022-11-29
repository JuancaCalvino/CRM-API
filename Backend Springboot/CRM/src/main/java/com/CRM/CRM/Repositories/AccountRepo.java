package com.CRM.CRM.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRM.CRM.Models.Account;

public interface AccountRepo extends JpaRepository<Account, Integer>{
}
