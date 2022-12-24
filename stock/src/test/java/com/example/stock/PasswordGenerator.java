package com.example.stock;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String rawpassword="12345";
		String encodedpass=encoder.encode(rawpassword);
		System.out.println(encodedpass);

	}

}
