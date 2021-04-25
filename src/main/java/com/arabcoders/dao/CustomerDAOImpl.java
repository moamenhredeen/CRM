package com.arabcoders.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.arabcoders.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// inject session factory 
	@Autowired
	private SessionFactory sessionFactory; 
	
	@Override 
	public Customer getCustomerById(int customerId) {
		return sessionFactory
				.getCurrentSession()
				.get(Customer.class, customerId); 
				
	}
	
	
	@Override
	public List<Customer> getCustomers() {
		
		return sessionFactory.getCurrentSession()
				.createQuery("from Customer order by lastName", Customer.class)
				.getResultList();
	}

	@Override
	public void saveCustomer(Customer customer) {
		sessionFactory.getCurrentSession()
			.saveOrUpdate(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		sessionFactory
			.getCurrentSession()
			.update(customer);
	}

	@Override
	public void deleteCustomer(int customerId) {
		sessionFactory
			.getCurrentSession()
			.createQuery("delete from Customer where id=:customerId")
			.setParameter("customerId", customerId)
			.executeUpdate();
	}

}
