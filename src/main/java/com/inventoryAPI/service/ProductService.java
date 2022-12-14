package com.inventoryAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventoryAPI.model.Product;
import com.inventoryAPI.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {

		return (List<Product>) productRepository.findAll();

	}

	public Product getProduct(Integer productId) {

		return (Product) productRepository.findById(productId).orElse(null);

	}

	public void addProduct(Product product) {
		productRepository.save(product);
	}

	public void updateProduct(Integer id, Product product) {
		productRepository.save(product);

	}

	public void deleteProduct(Integer id) {

		productRepository.deleteById(id);

	}

}