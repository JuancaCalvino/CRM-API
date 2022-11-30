package com.CRM.CRM.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.CRM.CRM.Models.Account;
import com.CRM.CRM.Repositories.AccountRepo;

public class AccountService {

	@Autowired
	AccountRepo accountRepository;

	public String saveAcount(Account account) {
	
		accountRepository.save(account);
		
		return "OK";
	}
}
