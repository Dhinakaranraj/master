package com.example.bank.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.bank.Dto.AccountDto;
import com.example.bank.entity.Account;
import com.example.bank.mapper.AccountMapper;
import com.example.bank.repository.AccountRepo;

@Service
public class AccountServiceImple implements AcccountService {

private AccountRepo accountRepo;


	public AccountServiceImple(AccountRepo accountRepo) {
	super();
	this.accountRepo = accountRepo;
}


	@Override
	public AccountDto createAccount(AccountDto accountdto) {
		Account account=AccountMapper.mapToAccount(accountdto);
		Account savedAccount=accountRepo.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
		
		
	}


	@Override
	public AccountDto getAccountById(Long id) {
	    Account account = accountRepo.findById(id)
	                                 .orElseThrow(() -> new RuntimeException("Account does not exist"));
	    return AccountMapper.mapToAccountDto(account);
	}


	@Override
	public AccountDto Deposit(Long id, double amount) {
		Account account = accountRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Account does not exist"));
		double total=account.getBalance()+amount;
		account.setBalance(total);
		Account savedAccount=accountRepo.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
		
	}


	@Override
	public AccountDto withdraw(Long id, double amount) {
		Account account = accountRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Account does not exist"));
		if(account.getBalance()< amount)
		{
			throw new RuntimeException("Insufficient amount");
		}
		
		double total=account.getBalance()-amount;
		account.setBalance(total);
		Account savedAccount=accountRepo.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}


	@Override
	public List<AccountDto> getAllAccounts() {
		List<Account> accounts =accountRepo.findAll();
		return accounts.stream().map((account)-> AccountMapper.mapToAccountDto(account))
				.collect(Collectors.toList());
	}


	@Override
	public void deleteAccount(Long id) {
		 
		Account account = accountRepo
				.findById(id)
				.orElseThrow(()-> new RuntimeException("Account Does Not Exists"));
				accountRepo.deleteById(id);	}

}
