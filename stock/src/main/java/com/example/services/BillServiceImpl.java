package com.example.services;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.entities.Bill;
import com.example.repositories.BillRepository;

@Service
public class BillServiceImpl implements BillService{
@Autowired
private BillRepository billRepository;

@Override
public List<Bill> getAllBills() {
	// TODO Auto-generated method stub
	return this.billRepository.findAll();
}

@Override
public void saveBill(Bill bill) {
	this.billRepository.save(bill);
	
}

@Override
public Bill getBillById(long id) {
	Optional<Bill> optional=this.billRepository.findById(id);
	Bill bill=null;
	if(optional.isPresent())
		bill=optional.get();
	else
		throw new RuntimeException("Bill Not found for This Id: "+id);
	return bill;
}

@Override
public void deleteBillById(long id) {
	this.billRepository.deleteById(id);
	
}
}
