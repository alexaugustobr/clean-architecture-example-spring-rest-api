package com.example.customerapi.application.service;

import com.example.customerapi.application.port.in.GetAllCustomersQuery;
import com.example.customerapi.application.port.in.GetCustomerQuery;
import com.example.customerapi.application.port.out.LoadCustomerPort;
import com.example.customerapi.domain.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
class CustomerQueryService implements GetAllCustomersQuery, GetCustomerQuery {

	private final LoadCustomerPort loadCustomerPort;
	
	@Override
	public List<Customer> findAll() {
		return loadCustomerPort.loadAll();
	}

	@Override
	public Customer getById(Long id) {
		return loadCustomerPort.load(id);
	}
}
