package com.yonatan.spring.service;

import java.util.List;

import com.yonatan.spring.model.Customer;
import com.yonatan.spring.repository.CustomerRepository;
import com.yonatan.spring.repository.HibernateCustomerRepositoryImp;

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
