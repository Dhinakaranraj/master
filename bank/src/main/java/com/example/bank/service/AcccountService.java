package com.example.bank.service;

import java.util.List;

import com.example.bank.Dto.AccountDto;

public interface AcccountService {
	
	AccountDto createAccount(AccountDto accountdto);

	AccountDto getAccountById(Long id);

	AccountDto Deposit(Long id, double amount);

	AccountDto withdraw(Long id, double amount);

	List<AccountDto> getAllAccounts();

	void deleteAccount(Long id);


}
