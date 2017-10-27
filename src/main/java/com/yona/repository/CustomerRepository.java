package com.yona.repository;

import java.util.List;

import com.yona.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}