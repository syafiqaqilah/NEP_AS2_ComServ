package com.nepcomserv.AS2.model;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false)
	private String name;
	@Column(columnDefinition="DECIMAL(7,2) NOT NULL")
	private double rating;
	@Column(nullable=false)
	private String file;
	@Column(nullable=false)
	private String review;
	private boolean inStock;
	
	public Product() {}
	
	public Product(String name, double rating, String file,String review, boolean inStock) {
		this.name = name;
		this.rating = rating;
		this.file = file;
		this.review = review;
		this.inStock = inStock;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public String getFile() {
		return file;
	}
	
	public void setFile(String file) {
		this.file = file;
	}
	
	public String getReview() {
		return review;
	}
	
	public void setReview(String review) {
		this.review = review;
	}
	
	public boolean isInStock() {
		return inStock;
	}
	
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
}
