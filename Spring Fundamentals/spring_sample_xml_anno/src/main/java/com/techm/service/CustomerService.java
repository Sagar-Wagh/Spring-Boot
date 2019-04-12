package com.techm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techm.model.Customer;
import com.techm.repository.CustomerRepository;
import com.techm.repository.HibernateCustomerRepository;

@Service("customerService")
public class CustomerService implements CustomerServiceInterface {

	//@Autowired
	 private CustomerRepository customerRepository;
	 @Autowired
	public CustomerService(CustomerRepository customerRepository)
	{
		System.out.println("Constuctor Injection");
		this.customerRepository=customerRepository;
	}
	 
	 // @Autowired
	 public void setCustomerRepository(CustomerRepository customerRepository) {
		 System.out.println("Setter Injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> finadAll()
	 {
		 return customerRepository.findAll();
	 }
}
