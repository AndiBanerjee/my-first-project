package com.tcs.model;

public class Address {
	
	String streetName;
	String city;
	String district;
	String landMark;
	int pinCode;
	/*public void sethouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public void setstreetName(String streetName) {
		this.streetName = streetName;
	}
	public void setlocality(String locality) {
		this.locality = locality;
	}
	public void setpinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public void setlandMark(String landMark) {
		this.landMark = landMark;
	}*/
	//default constructor
	public Address() {}
	//parameterized constructor
	public Address(String district,String streetName,String city,int pinCode,String landMark) {
		this.district = district;
		this.streetName = streetName;
		this.city = city;
		this.pinCode = pinCode;
		this.landMark = landMark;
	}
	//Getters
	public String getDistrict() {
		return this.district;
	}
	public String getstreetName() {
		return this.streetName;
	}
	public String getCity() {
		return this.city;
	}
	public int getpinCode() {
		return this.pinCode;
	}
	public String getlandMark() {
		return this.landMark;
	}
	//Setters
	public void setDistrict(String district) {
		this.district = district;
	}
	public void setstreetName(String streetName) {
		this.streetName = streetName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setpinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public void setlandMark(String landMark) {
		this.landMark = landMark;
	}
	@Override
	public String toString(){
		return "Ditrict :"+this.district+"\nStreet name:"+this.streetName+"\nCity:"+this.city+"\nPincode:"+this.pinCode+"\n Landmark:"+this.landMark;
	}
	/*public void display() {
		System.out.println("Address from Address class  display method:"+houseNumber+","+streetName+","+locality+","+pinCode+","+landMark);
	}*/
	/*public int gethouseNumber() {
		return this.houseNumber;
	}
	public String getstreetName() {
		return this.streetName;
	}
	public String getlocality() {
		return this.locality;
	}
	public int getpinCode() {
		return this.pinCode;
	}
	public String getlandMark() {
		return this.landMark;
	}*/
	
}
