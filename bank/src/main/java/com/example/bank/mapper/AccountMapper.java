package com.example.bank.mapper;

import com.example.bank.Dto.AccountDto;
import com.example.bank.entity.Account;

public class AccountMapper {
	
	public static Account mapToAccount(AccountDto accountdto)
	{
	     Account account = new Account(
	    		 accountdto.getId(),
	    		 accountdto.getAccountholdername(),
	    		 accountdto.getBalance()	
	    		 );
	return account;
	}
	
	public static AccountDto mapToAccountDto(Account account)
	{
		AccountDto accountdto=new AccountDto(
				
				account.getId(),
				account.getAccountholdername(),
				account.getBalance()
				);
		return accountdto;
	}			
}
