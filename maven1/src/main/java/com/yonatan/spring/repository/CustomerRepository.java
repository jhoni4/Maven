package com.yonatan.spring.repository;

import java.util.List;

import com.yonatan.spring.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}