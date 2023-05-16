package com.italent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.italent.dto.CustomerDTO;
import com.italent.entity.Customer;
import com.italent.execption.UserNotFoundException;
import com.italent.repo.CustomerRepositary;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepositary repo;
	
	
	@Override
	public Customer save(CustomerDTO customerDTO) {
		
		Customer customer=new Customer(customerDTO.getId(),customerDTO.getFirstName(),customerDTO.getLastName(),customerDTO.getAge(),customerDTO.getEmail(),customerDTO.getMobile());
		
		return repo.save(customer);
		
		 
	}


	@Override

	public Customer getCustomer(int id) throws UserNotFoundException {
		Customer customer=repo.findById(id).get();
		
		if(customer!=null) {
		return customer;
		}
		else {
			throw new UserNotFoundException("user not available with that id "+ id );
		}
		
	}
	
	
	
}
