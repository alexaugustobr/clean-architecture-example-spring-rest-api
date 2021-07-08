package com.example.customerapi.adapter.out.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")
class CustomerJPAEntity {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String email;
	
}
