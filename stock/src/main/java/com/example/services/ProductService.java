package com.example.services;

import java.util.List;

import com.example.entities.Product;

public interface ProductService {
List<Product> getAllProducts();
void saveProduct(Product product);
Product getProductById(long id);
void deleteProduct(long id);
}
