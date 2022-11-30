package com.CRM.CRM.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRM.CRM.Models.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer>{
}
