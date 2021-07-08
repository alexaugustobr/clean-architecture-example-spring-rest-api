package com.example.customerapi.application.port.in;

import com.example.customerapi.domain.Customer;

import java.util.List;

public interface GetAllCustomersQuery {
	
	List<Customer> findAll();
	
}
