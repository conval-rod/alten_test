package com.alten.test.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alten.test.dao.ProductRepository;
import com.alten.test.mapper.ProductMapper;
import com.alten.test.model.dto.ProductDto;
import com.alten.test.model.entities.ProductEntity;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	ProductMapper productMapper;

	public List<ProductDto> getProducts() {
		List<ProductEntity> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);

		List<ProductDto> productDtos = productMapper.productEntityToDTO(products);

		return productDtos;
	}

	public ProductDto createProduct(final ProductDto productDto) {
		ProductEntity productEntity = productMapper.productDTOtoEnity(productDto);
		ProductEntity createdProduct = productRepository.save(productEntity);
		ProductDto createdProductDto = productMapper.productEntityToDTO(createdProduct);

		return createdProductDto;
	}

	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}

	public ProductDto getProduct(Long id) {
		Optional<ProductEntity> productEntity = productRepository.findById(id);
		ProductDto productDto = productMapper.productEntityToDTO(productEntity.get());
		return productDto;
	}
}
