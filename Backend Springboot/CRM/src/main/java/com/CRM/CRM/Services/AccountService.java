package com.CRM.CRM.Services;

import com.CRM.CRM.Repositories.AccountRepo;

public class AccountService {

	AccountRepo accountRepository;

	public AccountService(AccountRepo accountRepository)
	{
		this.accountRepository = accountRepository;

	}
}
