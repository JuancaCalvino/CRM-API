package com.CRM.CRM.Services;

import java.util.List;

import com.CRM.CRM.Models.Account;
import com.CRM.CRM.Models.Opportunity;
import com.CRM.CRM.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRM.CRM.Models.Contact;
import com.CRM.CRM.Repositories.ContactRepo;

import jakarta.validation.Valid;

@Service
public class ContactService {

	@Autowired
	ContactRepo contactRepository;

	public Contact saveContact(@Valid Contact contact) {
		
		return contactRepository.save(contact);
	}

	public List<Contact> retrieveContacts() {
		
		return contactRepository.findAll();
	}

	// Actualiza la oportunidad dada en la base de datos
	public Boolean updateContact(Contact contact) {

		Integer Contact_ID = contact.getContactID();
		String Method = contact.getMethod();
		java.sql.Date Date = contact.getDate();
		Account Account = contact.getAccount();
		Opportunity Opportunity = contact.getOpportunity();

		try {
			contactRepository.update(Contact_ID, Method, Date, Account, Opportunity);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
