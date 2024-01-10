package com.tcs.model;

public class HouseAddress extends Address {
	int houseNumber;
	String houseName;
	public HouseAddress(String district,String streetName,String city,int pinCode,String landMark,int houseNumber,String houseName) {
		super(district,streetName,city,pinCode,landMark);
		this.houseNumber=houseNumber;
		this.houseName=houseName;
	}
	
	public void setHouseNumber(int houseNumber) {
		this.houseNumber=houseNumber;
	}
	public void setHouseName(String houseName) {
		this.houseName=houseName;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public String getHouseName() {
		return houseName;
	}
}
