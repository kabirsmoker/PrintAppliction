package com.xworkz.thor.DTO;

public class VehicleDTO {

	private String fueltype;
	private String type;
	private int cc;
	
	
	public VehicleDTO()
	{
		System.out.println("vehicle object is created");
	}


	public String getFueltype() {
		return fueltype;
	}


	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getCc() {
		return cc;
	}


	private void setCc(int cc) {
		this.cc = cc;
	}
	
	
	
	
	
}
