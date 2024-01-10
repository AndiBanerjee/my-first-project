package com.tcs.model;

public class Engineer extends Employee{
	String skill,project,role;
	public Engineer(String Id,String firstName,String lastName,String gender,String email,int age,Address A,String skill,String project,String role) {
		super(Id,firstName,lastName,gender,email,age,A);
		this.skill=skill;
		this.project=project;
		this.role=role;
	}
	@Override
	public String toString() {
		return super.toString()+"\nEngineer's Skill"+this.skill+"\nProject"+this.project+"\nRole"+this.role;
	}
	//String.format()
	public void setSkill(String skill) {
		this.skill=skill;
	}
	public void setProject(String project) {
		this.project=project;
	}
	public void setRole(String role) {
		this.role=role;
	}
	public String getSkill() {
		return skill;
	}
	public String getProject() {
		return project;
	}
	public String getRole() {
		return role;
	}
}
