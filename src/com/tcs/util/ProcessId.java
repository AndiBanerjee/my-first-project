package com.tcs.util;

public class ProcessId {
	String Id;
	public String generateId(String firstName,String lastName,int size) {
		return firstName.charAt(0)+lastName.charAt(0)+String.format("%05d",size);
	}
}
