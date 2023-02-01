package com.example.accountservice.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.example.accountservice.entity.Account;

@Repository
	public interface AccountRepository extends CassandraRepository<Account, String> {
	}

