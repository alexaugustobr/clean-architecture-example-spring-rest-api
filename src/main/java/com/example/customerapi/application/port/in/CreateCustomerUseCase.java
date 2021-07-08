package com.example.customerapi.application.port.in;

import com.example.customerapi.domain.Customer;

public interface CreateCustomerUseCase {
	
	Customer create(CreateCustomerCommand command);
	
}
