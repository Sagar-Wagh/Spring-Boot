package com.techm.service;

import java.util.List;

import com.techm.model.Customer;
import com.techm.repository.CustomerRepository;

public class CustomerService implements CustomerServiceInterface {

	private CustomerRepository customerRepository;
	
	 public CustomerService() {
		
	}
	 
	 public CustomerService(CustomerRepository customerRepository)
	 {
		 this.customerRepository=customerRepository;
	 }

	@Override
	public List<Customer> finadAll() {
		return customerRepository.findAll();
	}

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
