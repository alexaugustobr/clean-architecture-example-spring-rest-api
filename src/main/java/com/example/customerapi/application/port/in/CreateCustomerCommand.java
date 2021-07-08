package com.example.customerapi.application.port.in;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateCustomerCommand {
	
	private final String name;
	private final String email;
	
}
