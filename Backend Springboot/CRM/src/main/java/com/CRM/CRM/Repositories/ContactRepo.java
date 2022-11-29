package com.CRM.CRM.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRM.CRM.Models.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer>{
}
