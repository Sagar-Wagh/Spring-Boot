package com.techm.repository;

import java.util.ArrayList;
import java.util.List;

import com.techm.model.Customer;

public class HibernateCustomerRepository implements CustomerRepository {
    
	@Override
	public List<Customer> findAll()
	{
		List<Customer> customers=new ArrayList<>();
		
		Customer customer=new Customer();
		
		customer.setFirstName("Sagar");
		customer.setLastName("Wagh");
		
		customers.add(customer);
		return customers;
	}
	
}
