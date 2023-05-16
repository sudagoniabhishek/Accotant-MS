package com.italent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.italent.dto.CustomerDTO;
import com.italent.entity.Customer;
import com.italent.execption.UserNotFoundException;
import com.italent.service.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/account")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@PostMapping("/createAccount")
	public ResponseEntity<Customer> createCustomer(@RequestBody @Valid CustomerDTO customerDTO) {

		return ResponseEntity.ok(customerService.save(customerDTO));

	}

	@GetMapping("/getCustomer/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable int id) throws UserNotFoundException {

		return ResponseEntity.ok(customerService.getCustomer(id));

	}

	
	

	
	
	
	
	
	
	
}
