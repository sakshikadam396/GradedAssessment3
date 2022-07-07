package com.greatlearning.customer.entity;

import javax.persistence.Entity;
import javax.persistence.GenaratedValue;
import javax.persistence.GenarationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@table(name="customer")
public class Customer {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer() {
		
	}
	public Customer(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	@Override
	public String toString() {
		
		return "Customer Details: \nFirstname: "+firstname"\nLastname: +"lastname"\nEmail: +"email;
	}
	
	
	
	
	

}
