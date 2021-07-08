package com.example.customerapi.adapter.in.web;

import com.example.customerapi.domain.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
class CustomerModelMapper {

	Customer mapToDomainEntity(CustomerModel c) {
		return new Customer(c.getId(),c.getName(),c.getEmail());
	}

	CustomerModel mapToModel(Customer c) {
		return new CustomerModel(c.getId(),c.getName(),c.getEmail());
	}
	
}
