package com.greatlearning.customer.service;

import.java.util.List;

public interface CustomerService {

	public List<customer>findAll();
	public void save(Customer c);
}
