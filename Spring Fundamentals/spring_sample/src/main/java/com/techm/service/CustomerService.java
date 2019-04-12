package com.techm.service;

import java.util.List;

import com.techm.model.Customer;
import com.techm.repository.CustomerRepository;
import com.techm.repository.HibernateCustomerRepository;

public class CustomerService implements CustomerServiceInterface {

	 private CustomerRepository customerRepository=new HibernateCustomerRepository();
	 
	 @Override
	public List<Customer> finadAll()
	 {
		 return customerRepository.findAll();
	 }
}
