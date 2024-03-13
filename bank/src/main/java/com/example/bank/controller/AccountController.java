package com.example.bank.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.Dto.AccountDto;
import com.example.bank.service.AcccountService;

@RestController
@RequestMapping("/api")
public class AccountController {

	
	private AcccountService acccountservice;
	
	
	public AccountController( AcccountService acccountservice) {
		super();
		this.acccountservice = acccountservice;
	}


	//Add Account REST API
	
	@PostMapping("/create")
	public ResponseEntity<AccountDto>addAccount(@RequestBody AccountDto accountdto)
	{
		return new ResponseEntity<>(acccountservice.createAccount(accountdto),HttpStatus.CREATED);
	}
	
	//Get account REST API
	
	@GetMapping("/{id}/get")
	public ResponseEntity<AccountDto>getAccountById(@PathVariable Long id){
	AccountDto accountdto=acccountservice.getAccountById(id);
	return ResponseEntity.ok(accountdto);
	}
    // Deposit REST API
	
	@PutMapping("/{id}/deposit")
	public ResponseEntity<AccountDto>Deposit(@PathVariable Long id ,
			                                  @RequestBody Map<String, Double> reqeust)
	{
		AccountDto accountdto=acccountservice.Deposit(id, reqeust.get("amount"));
		return ResponseEntity.ok(accountdto);
	}
   //Withdraw REST API
	
	@PutMapping("/{id}/withdraw")
	public ResponseEntity<AccountDto> withdraw(@PathVariable Long id, @RequestBody Map<String, Double> request) {
	    double amount = request.get("amount");
	    AccountDto accountdto = acccountservice.withdraw(id, amount);
	    return ResponseEntity.ok(accountdto);
	}

	//Get all account REST API
	@GetMapping
	public ResponseEntity<List<AccountDto>> getAllAccounts()
	{
		List<AccountDto>accounts=acccountservice.getAllAccounts();
		return ResponseEntity.ok(accounts);
	}
	
    //Delete REST API
	@DeleteMapping("/{id}/delete")
	public ResponseEntity<String> deleteAccount(@PathVariable Long id)
	{
		acccountservice.deleteAccount(id);
		return ResponseEntity.ok("Delete Account Sucessfully!");
		
	}
	
	
	}
