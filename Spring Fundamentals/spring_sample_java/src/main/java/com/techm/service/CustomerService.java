package com.techm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.techm.model.Customer;
import com.techm.repository.CustomerRepository;

@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerService implements CustomerServiceInterface {

	
	 private CustomerRepository customerRepository;
	 public CustomerService()
	 {
		 
	 }
	 
	 public CustomerService(CustomerRepository customerRepository)
	 {
		 System.out.println("constructor injection");
		 this.customerRepository=customerRepository;
	 }
	 @Autowired 
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
