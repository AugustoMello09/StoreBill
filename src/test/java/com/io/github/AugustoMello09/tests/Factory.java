package com.io.github.AugustoMello09.tests;

import java.time.Instant;

import com.io.github.AugustoMello09.dto.ProductDTO;
import com.io.github.AugustoMello09.entities.Category;
import com.io.github.AugustoMello09.entities.Product;

public class Factory {
	public static Product createdProduct() {
		Product product = new Product(1L, "Phone", "Good Phone", 800.00,"https://img.com/img.png" , Instant.parse("2020-10-20T03:00:00Z"));
		product.getCategories().add(new Category(2L, "Electronics"));
		return product;
	}
	
	public static ProductDTO createdProductDTO() {
		Product product = createdProduct();
		return new ProductDTO(product, product.getCategories());
	}
}
