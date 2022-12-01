package com.CRM.CRM.Models;

import java.util.ArrayList;
import java.util.List;

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
@Table(name = "Opportunity")
public class Opportunity {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @JsonProperty
	private Integer Opportunity_ID;
	@NotBlank(message = "Name is mandatory") @JsonProperty
	private String Name;
	@NotBlank(message = "Priority is mandatory") @JsonProperty
	private Integer PriorityLevel;
	@NotBlank(message = "Status is mandatory") @JsonProperty
	private String Status;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "User_id", nullable = false) @JsonProperty
    private User user;
	
	@OneToMany(mappedBy = "Account_ID", fetch = FetchType.LAZY, cascade = CascadeType.ALL) @JsonProperty
	private ArrayList<Account> Accounts = new ArrayList<Account>();
	
	@OneToMany(mappedBy = "Contact_ID", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Contact> Contacts;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ArrayList<Account> getAccounts() {
		return Accounts;
	}
	public void setAccounts(ArrayList<Account> accounts) {
		Accounts = accounts;
	}
	public List<Contact> getContacts() {
		return Contacts;
	}
	public void setContacts(List<Contact> contacts) {
		Contacts = contacts;
	}
	public Integer getOpportunity_ID() {
		return Opportunity_ID;
	}
	public void setOpportunity_ID(Integer opportunity_ID) {
		Opportunity_ID = opportunity_ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getPriorityLevel() {
		return PriorityLevel;
	}
	public void setPriorityLevel(Integer priorityLevel) {
		PriorityLevel = priorityLevel;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
}
