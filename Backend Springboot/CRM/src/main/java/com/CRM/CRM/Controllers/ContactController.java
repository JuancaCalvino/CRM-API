package com.CRM.CRM.Controllers;

import java.util.List;

import com.CRM.CRM.Models.Opportunity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.CRM.CRM.Models.Contact;
import com.CRM.CRM.Services.ContactService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

	@Autowired
	ContactService contactService;

	// Crea un contacto
	@CrossOrigin()
	@PostMapping("/createContact")
	public ResponseEntity<Contact> createContact(@Valid @RequestBody Contact contact) {

		Contact contacto = contactService.saveContact(contact);

		if (contacto != null)
			return new ResponseEntity<>(contacto, HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	// Devuelve todos los contactos
	@CrossOrigin()
	@GetMapping("/getContacts")
	public ResponseEntity<List<Contact>> returnsContacts() {

		List<Contact> contactsList = contactService.retrieveContacts();

		if (contactsList.size() != 0)
			return new ResponseEntity<>(contactsList, HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	// Actualiza el contacto dado
	@CrossOrigin()
	@PutMapping("/updateContact")
	public ResponseEntity<Boolean> updateContact(Contact contact) {

		Boolean isUpdated = contactService.updateContact(contact);

		if (isUpdated == true)
			return new ResponseEntity<>(true, HttpStatus.OK);
		else
			return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
	}

	//Obtener contacto x
}
