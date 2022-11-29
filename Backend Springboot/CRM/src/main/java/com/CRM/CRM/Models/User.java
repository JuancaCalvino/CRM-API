package com.CRM.CRM.Models;

import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "Users")
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer User_ID;
	@NotEmpty
    private String Name;
	@NotEmpty
    private long Phone;
	@NotEmpty
    private String Email;
	@NotEmpty
    private String Address;
	@NotEmpty
    private String Password;
	
	@OneToMany(mappedBy = "Opportunity_ID", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ArrayList<Opportunity> Opportunities = new ArrayList<Opportunity>();

    public ArrayList<Opportunity> getOpportunities() {
		return Opportunities;
	}

	public void setOpportunities(ArrayList<Opportunity> opportunities) {
		Opportunities = opportunities;
	}

	public Integer getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(Integer user_ID) {
        User_ID = user_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getPhone() {
        return Phone;
    }

    public void setPhone(long phone) {
        Phone = phone;
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

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
