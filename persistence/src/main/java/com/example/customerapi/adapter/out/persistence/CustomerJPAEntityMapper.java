package com.example.customerapi.adapter.out.persistence;

import com.example.customerapi.domain.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
class CustomerJPAEntityMapper {

	Customer mapToDomainEntity(CustomerJPAEntity c) {
		return new Customer(c.getId(),c.getName(),c.getEmail());
	}
	
	CustomerJPAEntity mapToPersistenceEntity(Customer c) {
		return new CustomerJPAEntity(c.getId(),c.getName(),c.getEmail());
	}
	
}
