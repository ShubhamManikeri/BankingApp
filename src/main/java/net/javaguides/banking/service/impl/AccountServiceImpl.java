package net.javaguides.banking.service.impl;

import org.springframework.stereotype.Service;

import net.javaguides.banking.dto.AccountDto;
import net.javaguides.banking.repository.AccountRepository;
import net.javaguides.banking.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	
	
	private AccountRepository accountRepository;
	
	

	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}



	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
