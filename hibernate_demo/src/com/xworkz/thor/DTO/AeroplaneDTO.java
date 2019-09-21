package com.xworkz.thor.DTO;

import java.io.Serializable;

public class AeroplaneDTO implements Serializable{
	
	
	private String model;
	private String company;
	private double price;
	
	public AeroplaneDTO()
	{
		System.out.println("Aeroplane object created");
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
