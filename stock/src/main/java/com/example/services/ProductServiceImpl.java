package com.example.services;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.entities.Product;
import com.example.repositories.ProductRepositories;
@Service
public class ProductServiceImpl  implements ProductService{

	@Autowired
	private ProductRepositories productRepository;
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public void saveProduct(Product product) {
		this.productRepository.save(product);
		
	}

	@Override
	public Product getProductById(long id) {
		Optional<Product> optional=productRepository.findById(id);
		Product product=null;
		if(optional.isPresent())
			product=optional.get();
		else
			throw new RuntimeException("Product Not Found for id: "+id);
		return product;
	}

	@Override
	public void deleteProduct(long id) {
		this.productRepository.deleteById(id);
		
		
	}

}
