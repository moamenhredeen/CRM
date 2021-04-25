package com.arabcoders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.arabcoders.entity.Customer;
import com.arabcoders.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// inject DAO 
	@Autowired
	private CustomerService customerService; 
	
	public CustomerController() {
	}

	// get customers 
	
	@GetMapping("/list")
	public String getAllCustomer(Model model) {
		model.addAttribute("customers", customerService.getCustomers()); 
		return "customer-list";
	}
	
	
	// add customer 
	
	@GetMapping("/create")
	public String showCreateForm(Model model) {
		Customer customer = new Customer(); 
		model.addAttribute("customer", customer ); 
		return "customer-form"; 
	}
	
	@PostMapping("/create")
	public String processCreateForm(
			@ModelAttribute("customer") Customer customer
			) {
		customerService.saveCustomer(customer); 
		return "redirect:list"; 
	}
	
	
	// delete Customer 
	@GetMapping("/delete")
	public String deleteCustomer(
			@RequestParam("customerId") int customerId) {
		customerService.deleteCustomer(customerId); 
		return "redirect:list"; 
	}
	
	// update Custoemr
	@GetMapping("/update")
	public String updateCustomer(
			@RequestParam("customerId") int customerId,
			Model model) {
		; 
		model.addAttribute("customer", customerService.getCustomerById(customerId)); 
		return "customer-form"; 
	}
	
	
}
