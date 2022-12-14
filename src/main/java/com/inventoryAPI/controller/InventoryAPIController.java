package com.inventoryAPI.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.inventoryAPI.model.Product;
import com.inventoryAPI.service.ProductService;


@RestController
@RequestMapping("/products")
public class InventoryAPIController {
	@Autowired
	private ProductService productService;

	
	// default homepage 
	
	@GetMapping
	public ModelAndView home() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
	//for all products present in database
	@GetMapping("all")
	public List<Product> getAllProduct() {
		 return productService.getAllProducts();
	}

	
	//search method implementation
	@GetMapping("search")
	@ResponseBody
	public Product getProduct(@RequestParam Integer productId) {
		
		return productService.getProduct(productId);
		
//		ModelAndView model = new ModelAndView("result");
//		Product product=productService.getProduct(productId);
//		return model.addObject("products",product );
			
	
	}
		
		
	
//from to add product into database 
	@GetMapping("addProduct")
	public ModelAndView addProductForm() {
		Product product = new Product();
		ModelAndView model = new ModelAndView("addProduct");
		model.addObject("product", product);
		return model;
	}

	//handling post request to add product to database
	@RequestMapping(value = "addProduct", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product product) {

		productService.addProduct(product);

		return "Added Sucessfully";

	}



}