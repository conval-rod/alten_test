package com.alten.test.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductDto {

	private String code;
	private String name;
	private String description;
	private double price;
	private int quantity;
	private String inventoryStatus;
	private String category;
	private String image;
	private int rating;

	@Override
	public String toString() {
		return "ProductEntity [code=" + code + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", quantity=" + quantity + ", inventoryStatus=" + inventoryStatus + ", category=" + category
				+ ", image=" + image + ", rating=" + rating + "]";
	}
}
