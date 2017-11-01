package com.yona;

import com.yona.service.CustomerService;
import com.yona.service.CustomerServiceImpl;

public class App {

	public static void main(String[] args) {
		
		CustomerService service = new CustomerServiceImpl();
		
		System.out.println(service.findAll().get(0).getFirstName());
		System.out.println(service.findAll().get(0).getLastName());
		System.out.println( "Hello World!" );

	}

}