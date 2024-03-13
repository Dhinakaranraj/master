package com.example.springboot.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.springboot.entity.Customer;

@Service
public interface ServiceIF {

	Customer createAccount(Customer customer);

	List<Customer> getAllAccounts();


	Customer getById(Long id);

	ResponseEntity<?> updateAccount(Long id, Customer customer);

	ResponseEntity<?> deleteAccount(Long id);


}
