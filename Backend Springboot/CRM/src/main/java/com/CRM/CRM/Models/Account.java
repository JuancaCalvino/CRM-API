package com.CRM.CRM.Models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "Account")
public class Account {

	@JsonProperty
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Account_ID;
	@JsonProperty
	private String Name;
	@JsonProperty
	private String Email;
	@JsonProperty
	private String Address;
	@JsonProperty
	private long Phone;
	@JsonProperty
	private Boolean IsCustomer;
	@JsonProperty
	private Boolean IsActiveCustomer;
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "opportunity_id", nullable = false)
    private Opportunity opportunity;
	@JsonProperty
	@OneToMany(mappedBy = "Contact_ID", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Contact> Contacts;
	
	public Opportunity getOpportunity() {
		return opportunity;
	}
	public void setOpportunity(Opportunity opportunity) {
		this.opportunity = opportunity;
	}
	public List<Contact> getContacts() {
		return Contacts;
	}
	public void setContacts(List<Contact> contacts) {
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
