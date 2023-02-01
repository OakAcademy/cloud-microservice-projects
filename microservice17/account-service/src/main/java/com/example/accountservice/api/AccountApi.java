package com.example.accountservice.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.accountservice.service.AccountService;
import com.example.client.dto.AccountDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("account")
@RequiredArgsConstructor
public class AccountApi {
	 private final AccountService accountService;

	    @GetMapping("/{id}")
	    public ResponseEntity<AccountDto> get(@PathVariable("id") String id) {
	        return ResponseEntity.ok(accountService.get(id));
	    }

	    @PostMapping
	    public ResponseEntity<AccountDto> save(@RequestBody AccountDto account) {
	        return ResponseEntity.ok(accountService.save(account));
	    }

	    @PutMapping
	    public ResponseEntity<AccountDto> update(@PathVariable("id") String id, @RequestBody AccountDto account) {
	        return ResponseEntity.ok(accountService.update(id, account));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<AccountDto> delete(@PathVariable("id") String id) {
	        AccountDto dto=accountService.get(id);

	        accountService.delete(id);
	        return ResponseEntity.ok(dto);
	    }

	    @GetMapping
	    public ResponseEntity<List<AccountDto>> getAll() {
	        return ResponseEntity.ok(accountService.findAll());
	    }
}
