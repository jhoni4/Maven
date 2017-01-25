package com.yonatan.spring.service;

import java.util.List;

import com.yonatan.spring.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

}