package com.example.nin.rest;

import java.util.concurrent.atomic.AtomicInteger;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NINRepo {

	private AtomicInteger citizenIdGenerator = new AtomicInteger(0);
	
	public NINRepo() {
		
	}
	
	public String getNextId() {
		return String.format("%09d", citizenIdGenerator.incrementAndGet());
	}
	
}
