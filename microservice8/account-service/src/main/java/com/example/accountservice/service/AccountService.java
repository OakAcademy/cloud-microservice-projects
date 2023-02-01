package com.example.accountservice.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;

import org.modelmapper.internal.util.Assert;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.accountservice.entity.Account;
import com.example.accountservice.repository.AccountRepository;
import com.example.client.dto.AccountDto;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
public class AccountService {
	  private final AccountRepository accountRepository;
	    private final ModelMapper modelMapper;


	    public AccountDto get(String id) {
	        Account account = accountRepository.findById(id)
	                .orElseThrow(() -> new IllegalArgumentException());
	        return modelMapper.map(account, AccountDto.class);
	    }

	    @Transactional
	    public AccountDto save(AccountDto accountDto) {
	        Account account = modelMapper.map(accountDto, Account.class);
	        account = accountRepository.save(account);
	        accountDto.setId(account.getId());
	        return accountDto;
	    }

	    @Transactional
	    public AccountDto update(String id, AccountDto accountDto) {
	        Assert.isNull(id, "Id cannot be null");
	        Optional<Account> account = accountRepository.findById(id);
	        Account accountToUpdate = account.map(it -> {
	            it.setBirthDate(accountDto.getBirthDate());
	            it.setName(accountDto.getName());
	            it.setSurname(accountDto.getSurname());
	            return it;
	        }).orElseThrow(IllegalArgumentException::new);
	        return modelMapper.map(accountRepository.save(accountToUpdate), AccountDto.class);
	    }

	    @Transactional
	    public void delete(String id) {
	        Account account = accountRepository.findById(id)
	                .orElseThrow(() -> new IllegalArgumentException());
	        accountRepository.delete(account);
	    }

	    public List<AccountDto> findAll() {
	        List<Account> accounts = accountRepository.findAll();
	        List<AccountDto> list=new ArrayList<AccountDto>();



	        for (Account num : accounts)
	        {
	            AccountDto dto= new AccountDto();
	            dto.setBirthDate(num.getBirthDate());
	            dto.setId(num.getId());
	            dto.setName(num.getName());
	            dto.setSurname(num.getSurname());
	            dto.setEmail(num.getEmail());
	            dto.setUsername(num.getUsername());
	            list.add(dto);
	            // only changes num, not the array element

	        }
	        return list;
	    }
}
