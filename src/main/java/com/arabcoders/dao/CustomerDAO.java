package com.arabcoders.dao;

import java.util.List;

import com.arabcoders.entity.Customer;

public interface CustomerDAO {
	
	Customer getCustomerById(int customerId); 
	
	List<Customer> getCustomers();

	void saveCustomer(Customer customer);
	
	void updateCustomer(Customer customer); 
	
	void deleteCustomer(int customerId); 
	
}
