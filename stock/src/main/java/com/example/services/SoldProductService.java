package com.example.services;

import java.util.List;

import com.example.entities.SoldProduct;

public interface SoldProductService {
List<SoldProduct> getAllProducts();
void saveSoldProduct(SoldProduct soldProduct);
SoldProduct getSoldProductById(long id);
void deleteSoldProductById(long id);
void deleteSoldProductsAllById(List<Long> soldProductList);
void deleteSoldProductBeObject(SoldProduct soldProduct);

}
