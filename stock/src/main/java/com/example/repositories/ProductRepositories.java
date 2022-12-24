package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Product;
@Repository
public interface ProductRepositories extends JpaRepository<Product, Long> {

}
