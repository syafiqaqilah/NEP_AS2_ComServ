package com.nepcomserv.AS2.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.nepcomserv.AS2.model.*;

@Component
public class ProductRepository{
	private static final List<Product> ALL_PRODUCTS = Arrays.asList(
			new Product("GoMamam", 500.50, "/images/gomamam.jpg","test", true),
			new Product("Pizza Hut Brunei", 500.50, "/images/pizzahut.jpeg","test", true),
			new Product("Gerai Ramadhan", 500.50, "/images/gerairamadhan.png","test", true),
			new Product("Ta Pow", 500.50, "/images/tapow.png","test", true),
			new Product("Foodpanda", 500.50, "/images/foodpanda.png","test", true)
			);

	public static List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return ALL_PRODUCTS;
	}
	
//	public Product findByName(String name) {
//		for(Product product : ALL_PRODUCTS) {
//			if(product.getName().equals(name)) {
//				return product;
//			}
//		}
//		return null;
//	}
	
}
