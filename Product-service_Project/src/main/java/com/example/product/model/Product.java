package com.example.product.model;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
@Entity
public class Product {

	@Id
	@GeneratedValue
	private int id ;
	private String name;
	private int price ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Product() {
		super();
	}
	
}
