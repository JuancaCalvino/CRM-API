package com.CRM.CRM.Models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "Users")
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @JsonProperty
    private Integer User_ID;
	
	@NotBlank(message = "Name is mandatory") @JsonProperty
    private String Name;
	
	@NotNull(message = "Phone is mandatory") @JsonProperty
    private Integer Phone;
	
	@NotBlank(message = "Email is mandatory") 
	@Email(message="Please provide a valid email address") 
	@Pattern(regexp=".+@.+\\..+", message="Please provide a valid email address")
	@Column(unique=true) @JsonProperty
    private String Email;
	
	@NotBlank(message = "Address is mandatory") @JsonProperty
    private String Address;	
	
	@Size(min = 4, max = 15) @NotBlank(message = "Password is mandatory") @JsonProperty
    private String Password;
	
	@OneToMany(mappedBy = "Opportunity_ID", fetch = FetchType.LAZY, cascade = CascadeType.ALL) @JsonProperty
	private List<Opportunity> Opportunities;

    public List<Opportunity> getOpportunities() {
		return Opportunities;
	}

	public void setOpportunities(List<Opportunity> opportunities) {
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

    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer phone) {
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
