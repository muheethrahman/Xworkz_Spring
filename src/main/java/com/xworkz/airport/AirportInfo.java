package com.xworkz.airport;

public class AirportInfo {
	private String name;
	private String location;
	public AirportInfo() {
		System.out.println("Invoking the Default Constructor");
	}
	public AirportInfo(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Airport [name=" + name + ", location=" + location + "]";
	}

	public void runway() {
		System.out.println("runway invoked");
	}

	public void maintainance() {
		System.out.println("maintainance invoked");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
