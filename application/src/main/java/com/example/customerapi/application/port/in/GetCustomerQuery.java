package com.example.customerapi.application.port.in;

import com.example.customerapi.domain.Customer;

public interface GetCustomerQuery {
	
	Customer getById(Long id);
	
}
