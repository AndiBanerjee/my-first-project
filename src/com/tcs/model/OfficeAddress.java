package com.tcs.model;

public class OfficeAddress extends Address {
	String companyName,buildingName;
	public OfficeAddress(String district,String streetName,String city,int pinCode,String landMark,String companyName,String buildingName) {
		super(district,streetName,city,pinCode,landMark);
		this.companyName=companyName;
		this.buildingName=buildingName;
	}
	public void setCompanyName(String companyName) {
		this.companyName=companyName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName=buildingName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public String getBuildingName() {
		return buildingName;
	}
}
