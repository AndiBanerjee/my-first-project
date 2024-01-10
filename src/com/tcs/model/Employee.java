package com.tcs.model;

import com.tcs.util.InputDataUtil;

/**
 * A simple employee class
 * @author Anindita
 * 
 * 
 * */

public class Employee {
	//Seq- declaration of all private fields
	public String Id;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private int age;
	public Address A;
	
//	InputDataUtil IP=new InputDataUtil();
	
	//todo : this & super keyword
	
	/*public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public void setGender(String gender) {
		
			this.gender=gender;
		
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setAge(int age) {
		this.age=age;
	}*/
	//Non parameterized constructors
	public Employee() {
	}
	//Parameterized constructors
	public Employee(String Id,String firstName,String lastName,String gender,String email,int age,Address A) {
		this.Id=Id;
		this.firstName = firstName;
		this.lastName=lastName;
		this.gender=gender;
		this.email=email;
		this.age=age;
		this.A=A;
	}
	//Parameterized Constructor without address
	public Employee(String firstName,String lastName,String gender,String email,int age) {
		this.firstName = firstName;
		this.lastName=lastName;
		this.gender=gender;
		this.email=email;
		this.age=age;
		
	}
	//Public getters
	public String getfirstName() {
		return firstName;
		}
	public String getlastName() {
		return lastName;
		}
	public String getEmail() {
		return email;
		}
	public String getgender() {
		return gender;
		}
	public int getage() {
		return age;
		}
	public Address getaddress() {
		return A;
		}
	//Public setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public void setGender(String gender) {
		
			this.gender=gender;
		
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	
	//Public toString
	@Override
	public String toString() {
		return "Employee id"+this.Id+"\nFirst Name:"+this.firstName+"\nLast Name:"+this.lastName+"\nGender:"+this.gender+"\nAge:"+this.age+"\nEmail:"+this.email+"\nAddress :"+this.A;
	}
	
	/*
	public void display(Address A) {//used Address A for Has-A relationship between Employee and Address
		System.out.println("First Name from display method:"+firstName);
		System.out.println("Last Name from display method:"+lastName);
		System.out.println("Gender from display method:"+gender);
		System.out.println("Email from display method:"+email);
		System.out.println("Age from display method:"+age);
		
		//A.display();
		System.out.println("Address from display method:"+A.houseNumber+","+A.streetName+","+A.locality+","+A.pinCode+","+A.landMark);
		
	}*/
	/*public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getGender() {
		return this.gender;
	}
	public String getEmail() {
		return this.email;
	}
	public int getAge() {
		return this.age;
	}*/
}
