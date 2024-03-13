package com.example.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.springboot.entity.Customer;
import com.example.springboot.repository.AddressRepo;
import com.example.springboot.repository.CustomerRepo;

@Service
public class ServiceImple implements ServiceIF {
	@Autowired
	CustomerRepo cuRepo;

	@Autowired
	AddressRepo aRepo;

	@Override
	public Customer createAccount(Customer customer) {
		return cuRepo.save(customer);
	}

	@Override
	public List<Customer> getAllAccounts() {
		return cuRepo.findAll();
		}

	@Override
	public Customer getById(Long id) {
		return cuRepo.findById(id).orElse(null);
	}


	@Override
	public ResponseEntity<?> updateAccount(Long id, Customer customer) {
	    Optional<Customer> optional = cuRepo.findById(id);
	    if (optional.isPresent()) {
	        Customer cust = optional.get();
	        cust.setName(customer.getName());
	        cust.setEmail(customer.getEmail());
	        cust.setAddress1(customer.getAddress1());
	        cuRepo.save(cust);
	        return ResponseEntity.ok().body("Update successfully");
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}

	@Override
	public ResponseEntity<?> deleteAccount(Long id) {
		cuRepo.deleteById(id);
		return ResponseEntity.ok().body("delete successfully");
	}


}
