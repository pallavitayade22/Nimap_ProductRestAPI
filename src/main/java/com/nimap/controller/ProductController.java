package com.nimap.controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.nimap.entity.Product;
import com.nimap.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping(value = "/save-product")
	public boolean saveProduct(@Valid @RequestBody Product product){
		boolean isAdded = service.saveProduct(product);
		return isAdded;
	}
	
	@GetMapping(value = "/get-product-by-id/{id}")
	public Product getProductById(@PathVariable long id) {
		Product product = service.getProductById(id);
		return product;
	}
	
	@GetMapping(value = "/get-all-product")
	public List<Product> getAllProduct(@RequestParam int pageNumber) {
		List<Product> list = service.getAllProducts(pageNumber);
		return list;
	}

	@DeleteMapping("/delete-product-by-id/{productId}")
	public boolean deleteProduct(@PathVariable long productId) {
		boolean isDeleted = service.deleteProductById(productId);
		return isDeleted;
	}

	@PutMapping("/update-product")
	public boolean updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	


}
