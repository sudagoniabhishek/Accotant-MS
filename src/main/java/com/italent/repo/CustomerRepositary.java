package com.italent.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.italent.entity.Customer;

public interface CustomerRepositary extends JpaRepository<Customer,Integer> {



}
