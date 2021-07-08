package com.example.customerapi.application.port.out;

import com.example.customerapi.domain.Customer;

public interface UpdateCustomerStatePort {
	
	Customer save(Customer customer);
	
}
