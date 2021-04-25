package com.arabcoders.service;

import java.util.List;

import com.arabcoders.entity.Customer;

public interface CustomerService {
	
	Customer getCustomerById(int customerId); 
	
	List<Customer> getCustomers();

	void saveCustomer(Customer customer); 
	
	void updateCustomer(Customer customer);
	
	void deleteCustomer(int customerId); 
}
