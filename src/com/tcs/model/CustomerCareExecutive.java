package com.tcs.model;

public class CustomerCareExecutive extends Employee {
	private String shiftStartTime,shiftEndTime, region;
	public CustomerCareExecutive(String Id,String firstName,String lastName,String gender,String email,int age,Address A,String shiftStartTime,String shiftEndTime,String region) {
		super(Id,firstName,lastName,gender,email,age,A);
		this.shiftStartTime=shiftStartTime;
		this.shiftEndTime=shiftEndTime;
		this.region=region;
	}
	public void setShiftStartTime(String shiftStartTime) {
		this.shiftStartTime=shiftStartTime;
	}
	public void setShiftEndTime(String shiftEndTime) {
		this.shiftEndTime=shiftEndTime;
	}
	public void setRegion(String region) {
		this.region=region;
	}
	public String getShiftStartTime() {
		return shiftStartTime;
	}
	public String getShiftEndTime() {
		return shiftEndTime;
	}
	public String getRegion() {
		return region;
	}
}
