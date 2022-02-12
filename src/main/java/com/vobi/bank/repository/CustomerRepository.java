package com.vobi.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.vobi.bank.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	
	List<Customer> findByEnable(String enable);
	
	List<Customer> findByNameLike(String name);
}
