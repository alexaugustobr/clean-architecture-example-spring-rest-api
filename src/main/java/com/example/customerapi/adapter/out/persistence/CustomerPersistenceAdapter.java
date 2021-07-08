package com.example.customerapi.adapter.out.persistence;

import com.example.customerapi.application.port.out.exception.CustomerNotFoundException;
import com.example.customerapi.application.port.out.LoadCustomerPort;
import com.example.customerapi.application.port.out.UpdateCustomerStatePort;
import com.example.customerapi.domain.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

//Alternative name CustomerGateway
@Component
@AllArgsConstructor
class CustomerPersistenceAdapter implements UpdateCustomerStatePort, LoadCustomerPort {
	
	private final CustomerJPAEntityRepository repository;
	private final CustomerJPAEntityMapper mapper;
	
	@Override
	public Customer save(Customer customer) {
		CustomerJPAEntity entity = repository.save(mapper.mapToPersistenceEntity(customer));
		return mapper.mapToDomainEntity(entity);
	}

	@Override
	public Customer load(Long id) {
		return mapper.mapToDomainEntity(repository.findById(id).orElseThrow(CustomerNotFoundException::new));
	}

	@Override
	public List<Customer> loadAll() {
		return repository.findAll().stream().map(mapper::mapToDomainEntity).collect(Collectors.toList());
	}
}
