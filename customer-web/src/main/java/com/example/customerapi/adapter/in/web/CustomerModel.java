package com.example.customerapi.adapter.in.web;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class CustomerModel {

	private final Long id;
	private final String name;
	private final String email;
	
}
