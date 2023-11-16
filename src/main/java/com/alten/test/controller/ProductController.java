package com.alten.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.alten.test.model.dto.ProductDto;
import com.alten.test.services.ProductService;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	ProductService productService;

	/**
	 * Get all the products
	 * 
	 * @return list of products
	 */
	@GetMapping
	public ResponseEntity<List<ProductDto>> getProducts() {
		List<ProductDto> productDtos = productService.getProducts();
		return new ResponseEntity<>(productDtos, HttpStatus.OK);
	}

	/**
	 * Create a product
	 * 
	 * @param product
	 * @return newely created product
	 */
	@PostMapping(value = "/product")
	public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto product) {
		ProductDto productDto = productService.createProduct(product);
		return new ResponseEntity<>(productDto, HttpStatus.CREATED);
	}

	/**
	 * Deleted a product
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping(value = "/product/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	/**
	 * Get a product detail based on the id.
	 * 
	 * @param id
	 * @return product detail
	 */
	@GetMapping(value = "/product/{id}")
	public ResponseEntity<ProductDto> getProduct(@PathVariable Long id) {
		ProductDto productDto = productService.getProduct(id);
		return new ResponseEntity<>(productDto, HttpStatus.OK);
	}
}
