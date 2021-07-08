package com.example.customerapi.application.port.out;

import com.example.customerapi.domain.Customer;

import java.util.List;

public interface LoadCustomerPort {
	
	Customer load(Long id);

	List<Customer> loadAll();
	
}
