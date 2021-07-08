package com.example.customerapi.application.service;

import com.example.customerapi.application.port.in.CreateCustomerCommand;
import com.example.customerapi.application.port.in.CreateCustomerUseCase;
import com.example.customerapi.application.port.out.UpdateCustomerStatePort;
import com.example.customerapi.domain.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
class CreateCustomerService implements CreateCustomerUseCase {
	
	private final UpdateCustomerStatePort updateCustomerStatePort;
	
	@Override
	public Customer create(CreateCustomerCommand command) {
		return updateCustomerStatePort.save(new Customer(null, command.getName(), command.getEmail()));
	}
}
