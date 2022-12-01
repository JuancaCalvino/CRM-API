package com.CRM.CRM.Services;

import java.util.List;

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

	
}
