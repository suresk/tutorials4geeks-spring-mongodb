package com.tests4geeks.tutorials.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cars")
public class Car {

	private String id;
	
	private String make;
	
	private String model;
	
	private String description;
	
	private Integer year;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
	
}
