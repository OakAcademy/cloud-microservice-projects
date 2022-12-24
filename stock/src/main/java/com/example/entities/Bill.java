package com.example.entities;

import java.util.ArrayList;
import java.util.Date;
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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="bills")
public class Bill {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long Id;
@Column(name="customername")
private String customerName;
@Column(name="customersurname")
private String customersurname;
@Column(name="total_price")
private int total_price;
@Column(name="bill_date")
@Temporal(TemporalType.DATE)
private Date bill_date;
@Column(name="admin_confirmed")
private boolean admin_confirmed;
@Column(name="employee_confirmed")
private boolean employee_confirmed;
@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
@JoinColumn(name="bill_Id",referencedColumnName = "Id")
List<SoldProduct> soldproducts =new ArrayList<>();
public Bill() {
	// TODO Auto-generated constructor stub
}
public Bill(String customername,String customersurname,int total_price,Date bill_date,
		boolean admin_confirmed,boolean employee_confirmed,List<SoldProduct> sold_products) {
	
	this.customerName=customername;
	this.customersurname=customersurname;
	this.total_price=total_price;
	this.bill_date=bill_date;
	this.admin_confirmed=admin_confirmed;
	this.employee_confirmed=employee_confirmed;
	this.soldproducts=sold_products;
}
public long getId() {
	return Id;
}
public void setId(long id) {
	Id = id;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomersurname() {
	return customersurname;
}
public void setCustomersurname(String customersurname) {
	this.customersurname = customersurname;
}
public int getTotal_price() {
	return total_price;
}
public void setTotal_price(int total_price) {
	this.total_price = total_price;
}
public Date getBill_date() {
	return bill_date;
}
public void setBill_date(Date bill_date) {
	this.bill_date = bill_date;
}
public boolean isAdmin_confirmed() {
	return admin_confirmed;
}
public void setAdmin_confirmed(boolean admin_confirmed) {
	this.admin_confirmed = admin_confirmed;
}
public boolean isEmployee_confirmed() {
	return employee_confirmed;
}
public void setEmployee_confirmed(boolean employee_confirmed) {
	this.employee_confirmed = employee_confirmed;
}
public List<SoldProduct> getSoldproducts() {
	return soldproducts;
}
public void setSoldproducts(List<SoldProduct> soldproducts) {
	this.soldproducts = soldproducts;
}












}
