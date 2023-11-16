package com.alten.test.model.entities;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true, updatable = false)
	private int id;

	@Column(name = "code", nullable = false)
	private String code;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "description", nullable = false)
	private String description;

	@Column(name = "price", nullable = false)
	private double price;

	@Column(name = "quantity", nullable = false)
	private int quantity;

	@Column(name = "inventoryStatus", nullable = false)
	private String inventoryStatus;

	@Column(name = "category", nullable = false)
	private String category;

	@Column(name = "image", nullable = true)
	private String image;

	@Column(name = "rating", nullable = true)
	private int rating;

	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", code=" + code + ", name=" + name + ", description=" + description
				+ ", price=" + price + ", quantity=" + quantity + ", inventoryStatus=" + inventoryStatus + ", category="
				+ category + ", image=" + image + ", rating=" + rating + "]";
	}
}
