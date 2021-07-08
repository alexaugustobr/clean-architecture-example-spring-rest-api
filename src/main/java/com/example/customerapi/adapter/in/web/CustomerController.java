package com.example.customerapi.adapter.in.web;

import com.example.customerapi.application.port.in.CreateCustomerCommand;
import com.example.customerapi.application.port.in.CreateCustomerUseCase;
import com.example.customerapi.application.port.in.GetAllCustomersQuery;
import com.example.customerapi.application.port.in.GetCustomerQuery;
import com.example.customerapi.domain.Customer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/customers")
@AllArgsConstructor
class CustomerController {
	
	private final CustomerModelInputMapper inputMapper;
	private final CustomerModelMapper modelMapper;
	private final CreateCustomerUseCase createCustomerUseCase;
	private final GetCustomerQuery getCustomerQuery;
	private final GetAllCustomersQuery getAllCustomersQuery;
	
	@PostMapping()
	public CustomerModel create(@RequestBody CustomerInputModel input) {
		CreateCustomerCommand command = inputMapper.mapToCommand(input);
		Customer customer = createCustomerUseCase.create(command);
		return modelMapper.mapToModel(customer);
	}
	
	@GetMapping("/{id}")
	public CustomerModel getById(Long id) {
		Customer customer = getCustomerQuery.getById(id);
		return modelMapper.mapToModel(customer);
	}

	@GetMapping
	public List<CustomerModel> getAll(Long id) {
		List<Customer> customers = getAllCustomersQuery.findAll();
		return customers.stream().map(modelMapper::mapToModel).collect(Collectors.toList());
	}
	
}
