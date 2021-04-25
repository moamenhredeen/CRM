package com.arabcoders.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arabcoders.dao.CustomerDAO;
import com.arabcoders.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO; 
	
	@Override 
	@Transactional
	public Customer getCustomerById(int customerId) {
		return customerDAO.getCustomerById(customerId); 
	}
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers(); 
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		customerDAO.saveCustomer(customer);
	}

	@Override
	@Transactional
	public void updateCustomer(Customer customer) {
		customerDAO.updateCustomer(customer);
	}

	@Override
	@Transactional
	public void deleteCustomer(int customerId) {
		customerDAO.deleteCustomer(customerId);
	}


	
}
