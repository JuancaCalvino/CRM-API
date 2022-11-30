package com.CRM.CRM.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRM.CRM.Models.Account;
import com.CRM.CRM.Repositories.AccountRepo;

@Service
public class AccountService {

	@Autowired
	AccountRepo accountRepository;

	//Intenta guardar la cuenta recibida
	public Account saveAcount(Account account) {
	
		accountRepository.save(account);
		
		return accountRepository.save(account);
	}

	// Devuelve todas las cuentas de la base de datos
	public List<Account> retrieveAccounts() {
		
		return accountRepository.findAll();
	}
}
