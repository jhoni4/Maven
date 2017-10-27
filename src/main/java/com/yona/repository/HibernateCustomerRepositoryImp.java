package com.yona.repository;

import java.util.ArrayList;
import java.util.List;

import com.yona.model.Customer;

public class HibernateCustomerRepositoryImp implements CustomerRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.yonatan.spring.repository.CustomerRepository#findAll()
	 */
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList();
		Customer customer = new Customer();
		customer.setFirstName("Jhon");
		customer.setLastName("Doe");
		customers.add(customer);
		return customers;
	}
}