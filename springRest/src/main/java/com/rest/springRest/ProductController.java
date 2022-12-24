package com.rest.springRest;

import java.sql.Date;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import jakarta.xml.bind.annotation.XmlRootElement;

@RestController
@RequestMapping("api")

public class ProductController {

	
	
	
	
	
	
	
	
	
	
	public List<Product> FillList()
	{
		List<Product> list=new ArrayList<>();
		Product product=new Product();
		product.setId(1);
		product.setName("John");
		list.add(product);
		product=new Product();
		product.setId(2);
		product.setName("Jack");
		list.add(product);
		product=new Product();
		product.setId(3);
		product.setName("David");
		list.add(product);
		product=new Product();
		product.setId(4);
		product.setName("Lizy");
		list.add(product);
		product=new Product();
		product.setId(5);
		product.setName("Geroge");
		list.add(product);
		return list;
	}
	
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<Product> findall() throws ParseException {
				
		List<Product> list = new ArrayList<>();
		list=FillList();
		return list;
	}

	@GetMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Product findbyId(@PathVariable("id") long id) {
		Product product = new Product();
		return product;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public long Create(@RequestBody Product product) {
		return 0;
	}

	@PutMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void Update(@PathVariable("id") long id, @RequestBody Product product) {

	}

	@DeleteMapping(value = "/id")
	@ResponseStatus(HttpStatus.OK)
	public void Delete(@PathVariable("id") long id) {

	}
	

}
