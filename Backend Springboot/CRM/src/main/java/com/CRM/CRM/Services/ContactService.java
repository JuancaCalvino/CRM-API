package com.CRM.CRM.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRM.CRM.Models.Contact;
import com.CRM.CRM.Repositories.ContactRepo;

@Service
public class ContactService {

	@Autowired
	ContactRepo contactRepository;

	public Contact saveContact(Contact contact) {

		return contactRepository.save(contact);
	}

	public List<Contact> retrieveContacts() {

		return contactRepository.findAll();
	}

	// Actualiza el contacto dado en la base de datos
	public Boolean updateContact(Contact contact) {

		Integer contactId = contact.getContactID();
		String method = contact.getMethod();
		java.sql.Date date = contact.getDate();

		try {
			contactRepository.update(contactId, method, date);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
