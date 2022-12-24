package com.example.services;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.entities.SoldProduct;
import com.example.repositories.SoldProductRepository;
@Service
public class SoldProductServiceImpl implements SoldProductService {

	@Autowired
	private SoldProductRepository soldProductRepository;
	@Override
	public List<SoldProduct> getAllProducts() {
		// TODO Auto-generated method stub
		return this.soldProductRepository.findAll();
	}
@Override
	public void saveSoldProduct(SoldProduct soldProduct) {
		this.soldProductRepository.save(soldProduct);
		
		
	}

	@Override
	public SoldProduct getSoldProductById(long id) {
		// TODO Auto-generated method stub
		Optional<SoldProduct> optional=this.soldProductRepository.findById(id);
		SoldProduct soldProduct=null;
		if(optional.isPresent())
			soldProduct=optional.get();
		else
			throw new RuntimeException("Sold Product is not found by Id::"+id);
		
		return soldProduct;
	}

	@Override
	public void deleteSoldProductById(long id) {
		this.soldProductRepository.deleteById(id);
		
	}

	@Override
	public void deleteSoldProductsAllById(List<Long> soldProductList) {
		this.soldProductRepository.deleteAllById(soldProductList);
		
	}

	@Override
	public void deleteSoldProductBeObject(SoldProduct soldProduct) {
		this.soldProductRepository.delete(soldProduct);
		
	}

}
