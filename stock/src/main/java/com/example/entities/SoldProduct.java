package com.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="soldproducts")
public class SoldProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@Column(name="piece",nullable = false)
	private int piece;
	@Column(name="in_basket")
	private boolean in_basket;
	@Column(name="product_Id")
	private long product_Id;
	@Column(name="bill_Id")
	private long bill_Id;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public int getPiece() {
		return piece;
	}
	public void setPiece(int piece) {
		this.piece = piece;
	}
	public boolean isIn_basket() {
		return in_basket;
	}
	public void setIn_basket(boolean in_basket) {
		this.in_basket = in_basket;
	}
	public long getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(long product_Id) {
		this.product_Id = product_Id;
	}
	public long getBill_Id() {
		return bill_Id;
	}
	public void setBill_Id(long bill_Id) {
		this.bill_Id = bill_Id;
	}
	
	
}
