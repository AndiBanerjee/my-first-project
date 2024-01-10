package com.tcs.util;
import java.io.PrintStream;
import java.util.Scanner;
import com.tcs.model.*;

public class InputDataUtil{
	
	
	
	//public int num;
	int i=0,size;
	int age,k1;String empId;
	String FN = null;
	String LN = null;
	Scanner sc=null;
	String Email,s;
	String Gender = null;
	Employee Emp[];
	String streetName = null,city = null,landmark = null,district;
	int pinCode = 0;
	Address A;
	ProcessId P;
	public InputDataUtil() {}
	public InputDataUtil(Scanner sc,int size) {
		this.sc=sc;
		this.size=size;
		Emp=new Employee[size];
		}
	
	public void takeInput(int option) {
		switch(option){
	 	case 1 :makeEmployee();
	 			break;
	 	
	 	case 2: sc.nextLine();
	 			System.out.println("Enter the employee id whose details you want to edit");
	 			s=sc.nextLine();
	 			for(k1=0;k1<i;k1++) {
	 				if((Emp[k1].Id).equals(s)) 
	 					break;
	 				}
	 			editEmployee(k1);
	 			break;
	 	case 3 : System.out.println("Below are the employee details");
	 			 for(int i1=0;i1<i;i1++) {
	 				if(Emp[i1]!=null)
	 					System.out.println(Emp[i1].toString());
					}
				 break;
	 	case 4: System.out.println("Enter the employee id whose address you want to edit");
	 			sc.nextLine();
	 			s=sc.nextLine();
					for(k1=0;k1<i;k1++) {
						if((Emp[k1].Id).equals(s)) 
							break;
					}
				editAddress(k1);
	 			
					break;
	 	case 5: sc.nextLine();
					System.out.println("Enter the employee id whose details you want to delete");
					s=sc.nextLine();
					for(int k2=0;k2<i;k2++) {
	 				if((Emp[k2].Id).equals(s)) {
	 					Emp[k2]=null;
	 					break;
	 				}
	 			}
					break;
		default : System.out.println("Invalid option try again");
	 			break;
	 			
	 }
	}
	public void makeEmployee() {
		
		int c,c2;
		//System.out.println("Enter number of employees");
		//num=sc.nextInt();
		
	//	for(int i=0;i<num;i++) {
			sc.nextLine();
			System.out.println("Enter First name");
			FN=sc.nextLine();
			System.out.println("Enter last name");
			LN=sc.nextLine();
			System.out.println("Enter Email");
			Email=sc.nextLine();
			outer:
				for(int j=0;j<Email.length();j++) {
					if(Email.charAt(j)=='@' ) {
						for(int k=j+1;k<Email.length();k++) {
							if(Email.charAt(k)=='.') {
								System.out.println("Correct email");
								break outer;
							}
							c2=k;
							if(c2==Email.length()-1) {
								System.out.println("Invalid email id");
								System.exit(0);
							}
						}
					}
					c=j;
					if(c==(Email.length()-1)) {
						System.out.println("Invalid email");
						break outer;
					}
				}
	
			System.out.println("Enter Gender as Female/Male/Other");
			Gender=sc.nextLine();
		
			if( Gender.charAt(0) != 'F' && Gender.charAt(0)!= 'M' && Gender.charAt(0)!='O') {
				System.out.println("Invalid Gender");
				System.exit(0);
			}
			System.out.println("Enter Age");
			age=sc.nextInt();
			if(age<18 || age>45) {
				System.out.println("*********Invalid Age**********");
				System.exit(0);
			}
		
			Employee E= new Employee(generateId(FN,LN,(i+1)),FN,LN,Gender,Email,age,makeAddress());
			Emp[i]=E;
			//empId=
			i++;
			
		
		}
		public int getLength() {
		
			return i;
		}
		/*public void editFirstName(Scanner sc,int index) {
			
			sc.nextLine();
			System.out.println("Enter First name");
			FN=sc.nextLine();
			Emp[index].setFirstName(FN);
		}
		public void editLastName(Scanner sc,int index) {
			sc.nextLine();
			System.out.println("Enter Last name");
			LN=sc.nextLine();
			Emp[index].setLastName(LN);
		}
		public void editEmail(Scanner sc,int index) {
			sc.nextLine();
			System.out.println("Enter the email you want to update");
			Email=sc.nextLine();
			Emp[index].setEmail(Email);
		}
		public void editAge(Scanner sc,int index) {
			sc.nextLine();
			System.out.println("Enter updated age");
			age=sc.nextInt();
			Emp[index].setAge(age);
		}
		public void editGender(Scanner sc,int index) {
			sc.nextLine();
			System.out.println("Enter updated gender");
			Gender=sc.nextLine();
			Emp[index].setGender(Gender);
		}*/
		
		 public void editEmployee(int index){
		 	//sc.nextLine();
		 	System.out.println("Enter 1 -First name,2-last name,3-Email ,4-Age,5-Gender");
		 	int j=sc.nextInt();
		 	if(j==1){
		 		System.out.println("Enter updated First name");
		 		sc.nextLine();
		 		FN=sc.nextLine();
				Emp[index].setFirstName(FN);
				}
		 	if(j==2) {
		 		System.out.println("Enter updated Last name");
		 		sc.nextLine();
		 		LN=sc.nextLine();
				Emp[index].setLastName(LN);
		 	}
		 	if(j==3) {
		 		System.out.println("Enter updated email address");
		 		sc.nextLine();
		 		Email=sc.nextLine();
				Emp[index].setEmail(Email);
		 	}
		 	if(j==4) {
		 		System.out.println("Enter updated age");
		 		sc.nextLine();
		 		age=sc.nextInt();
				Emp[index].setAge(age);
		 	}
		 	if(j==5) {
		 		System.out.println("Enter updated Gender");
		 		sc.nextLine();
		 		Gender=sc.nextLine();
				Emp[index].setGender(Gender);
		 	}
		 }
		 
		  public void editAddress(int index){
		  	System.out.println("Enter 1 -District,2-street name,3-city ,4-pin code,5-landmark");
 			int j1=sc.nextInt();
 			if(j1==1){
 				sc.nextLine();
				System.out.println("Enter updated House number");
				district=sc.nextLine();
				Emp[index].A.setDistrict(district);
 					}
 			if(j1==2){
 				sc.nextLine();
				System.out.println("Enter updated street name");
				streetName=sc.nextLine();
				Emp[index].A.setstreetName(streetName);
 					}
 			if(j1==3){
 				sc.nextLine();
				System.out.println("Enter updated city");
				city=sc.nextLine();
				Emp[index].A.setCity(city);
 					}
 			if(j1==4){
 				sc.nextLine();
				System.out.println("Enter updated pin code");
				pinCode=sc.nextInt();
				Emp[index].A.setpinCode(pinCode);
 					}
 			if(j1==5){
 				sc.nextLine();
				System.out.println("Enter updated landmark");
				landmark=sc.nextLine();
				Emp[index].A.setlandMark(landmark);
 					}
 					
 					
		  }
		  public Employee[] getEmp() {
			  return Emp;
		  }
		
		/*public void editHouseNumber(Scanner sc) {
			sc.nextLine();
			System.out.println("Enter updated House number");
			houseNumber=sc.nextInt();
			Emp[0].A.sethouseNumber(houseNumber);
		}
		public void editStreetName(Scanner sc) {
			sc.nextLine();
			System.out.println("Enter updated Street Name");
			streetName=sc.nextLine();
			Emp[0].A.setstreetName(streetName);
		}
		public void editlocality(Scanner sc) {
			sc.nextLine();
			System.out.println("Enter updated Locality");
			locality=sc.nextLine();
			Emp[0].A.setlocality(locality);
		}
		public void editPinCode(Scanner sc) {
			sc.nextLine();
			System.out.println("Enter updated pin code");
			pinCode=sc.nextInt();
			Emp[0].A.setpinCode(pinCode);
		}
		public void editLandMark(Scanner sc) {
			sc.nextLine();
			System.out.println("Enter updated land mark");
			landmark=sc.nextLine();
			Emp[0].A.setlandMark(landmark);
		}*/
		
		public Address makeAddress() {
			
			
				sc.nextLine();
				System.out.println("Enter Address details");
				System.out.println("Enter District");
				district=sc.nextLine();
				System.out.println("Enter street name");
				streetName=sc.nextLine();
				System.out.println("Enter city");
				city=sc.nextLine();
				System.out.println("Enter pin code");
				pinCode=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter land mark");
				landmark=sc.nextLine();
				Address A=new Address(district,streetName,city,pinCode,landmark);
				return A;
		}
		
		public String generateId(String firstName,String lastName,int size) {
				return firstName.charAt(0)+""+lastName.charAt(0)+String.format("%05d",size);
			
		}
		

	}