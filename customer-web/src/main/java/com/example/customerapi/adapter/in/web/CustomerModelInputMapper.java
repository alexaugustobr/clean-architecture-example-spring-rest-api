package com.example.customerapi.adapter.in.web;

import com.example.customerapi.application.port.in.CreateCustomerCommand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
class CustomerModelInputMapper {

	public CreateCustomerCommand mapToCommand(CustomerInputModel c) {
		return new CreateCustomerCommand(c.getName(),c.getEmail());
	}
}
