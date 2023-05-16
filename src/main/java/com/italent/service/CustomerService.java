package com.italent.service;

import com.italent.dto.CustomerDTO;
import com.italent.entity.Customer;
import com.italent.execption.UserNotFoundException;

public interface CustomerService {

	Customer save(CustomerDTO customerDTO);

	 Customer getCustomer(int id) throws UserNotFoundException;

}
