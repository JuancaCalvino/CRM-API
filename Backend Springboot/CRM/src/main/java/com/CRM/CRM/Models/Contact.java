package com.CRM.CRM.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "Contact")
public class Contact {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Contact_ID;
	@NotEmpty
	private String Method;
	@NotEmpty
	private java.sql.Date Date;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Account_id", nullable = false)
    private Account account;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Opportunity_id", nullable = false)
    private Opportunity opportunity;
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Opportunity getOpportunity() {
		return opportunity;
	}
	public void setOpportunity(Opportunity opportunity) {
		this.opportunity = opportunity;
	}
	
	public Integer getContact_ID() {
		return Contact_ID;
	}
	public void setContact_ID(Integer contact_ID) {
		Contact_ID = contact_ID;
	}
	public String getMethod() {
		return Method;
	}
	public void setMethod(String method) {
		Method = method;
	}
	public java.sql.Date getDate() {
		return Date;
	}
	public void setDate(java.sql.Date date) {
		Date = date;
	}
}
