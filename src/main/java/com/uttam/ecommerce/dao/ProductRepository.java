package com.uttam.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uttam.ecommerce.entity.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
