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

@Entity
@Table(name = "Opportunity")
public class Opportunity {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer opportunityID;

	private String name;
	private Integer priorityLevel;
	private String status;

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "User_id", nullable = false)
    private User user;

	@OneToMany(mappedBy = "accountID", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Account> accounts;

	@OneToMany(mappedBy = "contactID", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Contact> contacts;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	public Integer getOpportunityID() {
		return opportunityID;
	}
	public void setOpportunityID(Integer opportunityID) {
		this.opportunityID = opportunityID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPriorityLevel() {
		return priorityLevel;
	}
	public void setPriorityLevel(Integer priorityLevel) {
		this.priorityLevel = priorityLevel;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
