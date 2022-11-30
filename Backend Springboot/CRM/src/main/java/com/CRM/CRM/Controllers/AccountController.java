package com.CRM.CRM.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CRM.CRM.Models.Account;
import com.CRM.CRM.Services.AccountService;

import jakarta.validation.Valid;

@RestController
public class AccountController {

	@Autowired
	AccountService accountService;

	// Inserta una cuenta en la base de datos
	@CrossOrigin()
	@PostMapping("/accounts/account")
	public ResponseEntity<Account> registerAccount(@Valid @RequestBody Account account) {

		Account response = accountService.saveAcount(account);

		if (response == account)
			return new ResponseEntity<>(response, HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	// Devuelve todas las cuentas
	@CrossOrigin()
	@GetMapping("/accounts")
	public ResponseEntity<List<Account>> returnsAccounts() {

		List<Account> accountsList = accountService.retrieveAccounts();

		if (accountsList.size() != 0)
			return new ResponseEntity<>(accountsList, HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
