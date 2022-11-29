package com.CRM.CRM.Services;

import com.CRM.CRM.Repositories.ContactRepo;

public class ContactService {

	ContactRepo contactRepository;

	public ContactService(ContactRepo contactRepository)
	{
		this.contactRepository = contactRepository;

	}
}
