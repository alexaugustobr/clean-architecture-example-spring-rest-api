package com.example.customerapi.domain;

import com.sun.istack.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
	
	@Nullable
	private Long id;
	private String name;
	private String email;
	
}
