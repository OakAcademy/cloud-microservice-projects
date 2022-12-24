package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.extras.springsecurity6.dialect.SpringSecurityDialect;

import jakarta.validation.Validator;

@Configuration
public class WebConfig  implements WebMvcConfigurer{

	@Autowired
	private MessageSource messageSource;
	
	@Override
	public void addViewControllers(ViewControllerRegistry registery)
	{
		registery.addViewController("/").setViewName("index");
		registery.addViewController("/Login").setViewName("Login");
		registery.addViewController("/AdminHome").setViewName("AdminHome");
		registery.addViewController("/EmployeeHome").setViewName("EmployeeHome");
		
		
	}
	@Bean
	public SpringSecurityDialect securityDialect()
	{
		return new SpringSecurityDialect();
		
	}
	
	@Override
	public org.springframework.validation.Validator getValidator()
	{
		LocalValidatorFactoryBean factory=new LocalValidatorFactoryBean();
		factory.setValidationMessageSource(messageSource);
		return factory;
		
	}
	
	
	
	
	
	
	
	
	
	
}
