package com.alten.test.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.alten.test.model.dto.ProductDto;
import com.alten.test.model.entities.ProductEntity;

@Mapper(componentModel = "spring")
public interface ProductMapper {

	ProductDto productEntityToDTO(ProductEntity entity);

	ProductEntity productDTOtoEnity(ProductDto dto);

	List<ProductDto> productEntityToDTO(List<ProductEntity> entity);

	List<ProductEntity> productDTOtoEnity(List<ProductDto> dto);
}