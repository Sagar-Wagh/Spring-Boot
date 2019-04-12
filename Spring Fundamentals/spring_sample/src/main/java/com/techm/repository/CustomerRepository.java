package com.techm.repository;

import java.util.List;

import com.techm.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}