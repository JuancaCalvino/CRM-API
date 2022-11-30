package com.CRM.CRM.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CRM.CRM.Models.Account;
import com.CRM.CRM.Services.AccountService;

@RestController
public class AccountController {

	@Autowired
	AccountService accountService;

	@CrossOrigin()
	@PostMapping("/accounts/account")
	public String registerAccount(@RequestBody Account account) {

		String respuesta = accountService.saveAcount(account);

		if(respuesta=="OK")
			return respuesta;
		else
			return respuesta;
	}
}
