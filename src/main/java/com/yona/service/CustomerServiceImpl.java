package com.yona.service;

import java.util.List;

import com.yona.model.Customer;
import com.yona.repository.CustomerRepository;
import com.yona.repository.HibernateCustomerRepositoryImp;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImp();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.yonatan.spring.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
