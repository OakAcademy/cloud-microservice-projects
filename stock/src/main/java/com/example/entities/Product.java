package com.example.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Column(name="name",nullable = false)
	private String name;
	@Column(name="price",nullable = false)
	private int price;
	@Column(name="stock",nullable = false)
	private int stock;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="product_Id",referencedColumnName = "Id")
	List<SoldProduct> sold_products=new ArrayList<>();;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String name,int price,int stock) {
		
		super();
		this.name=name;
		this.price=price;
		this.stock=stock;
		
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public List<SoldProduct> getSold_products() {
		return sold_products;
	}
	public void setSold_products(List<SoldProduct> sold_products) {
		this.sold_products = sold_products;
	}
	
	
	
	
	
}
