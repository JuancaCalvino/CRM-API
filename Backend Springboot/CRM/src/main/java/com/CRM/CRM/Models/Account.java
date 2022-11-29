package com.CRM.CRM.Models;

import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "Account")
public class Account {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Account_ID;
	@NotEmpty
	private String Name;
	@NotEmpty
	private String Email;
	@NotEmpty
	private String Address;
	@NotEmpty
	private long Phone;
	@NotEmpty
	private Boolean IsCustomer;
	@NotEmpty
	private Boolean IsActiveCustomer;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "opportunity_id", nullable = false)
    private Opportunity opportunity;
	
	@OneToMany(mappedBy = "Contact_ID", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ArrayList<Contact> Contacts = new ArrayList<Contact>();
	
	public Opportunity getOpportunity() {
		return opportunity;
	}
	public void setOpportunity(Opportunity opportunity) {
		this.opportunity = opportunity;
	}
	public ArrayList<Contact> getContacts() {
		return Contacts;
	}
	public void setContacts(ArrayList<Contact> contacts) {
		Contacts = contacts;
	}
	
	public Integer getAccount_ID() {
		return Account_ID;
	}
	public void setAccount_ID(Integer account_ID) {
		Account_ID = account_ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	public Boolean getIsCustomer() {
		return IsCustomer;
	}
	public void setIsCustomer(Boolean isCustomer) {
		IsCustomer = isCustomer;
	}
	public Boolean getIsActiveCustomer() {
		return IsActiveCustomer;
	}
	public void setIsActiveCustomer(Boolean isActiveCustomer) {
		IsActiveCustomer = isActiveCustomer;
	}	
}
