package com.example.bank.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
	
	private Long id;
	private String accountholdername;
	private double balance;
}
	
	




