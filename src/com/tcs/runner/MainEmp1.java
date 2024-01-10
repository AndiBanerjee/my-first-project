package com.tcs.runner;
import com.tcs.util.*;
import com.tcs.model.*;
import java.util.Scanner;
public class MainEmp1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k1,k2,size,i ;
	//	System.out.println("Enter the storage size");
	//	size=sc.nextInt();
	//	InputDataUtil IP=new InputDataUtil(sc,size);
	//	Employee E[] = IP.getEmp();
		Address A=new Address("Hooghly","Sarat Bose","Kolkata",700035,"near Kali mandir");
		//i=IP.getLength();
		String s;
		Engineer Eg=new Engineer("AB00292","Anindita","Banerjee","F","aninditaban96@gmail.com",28,A,"Java","Citi","Developmet");
		Eg.toString();
		System.out.println("Engineer details"+Eg);
		//Employee EM = null;
		//String EFN,ELN,s;
		//Address Add[]=null;
	//	boolean flag = true;
		/*while(flag) {
		 System.out.println("Enter the desired options");
		 System.out.println("enter 1 to Add an employee");
		 System.out.println("enter 2 to edit employee");
		 System.out.println("enter 3 Display all employee and address");
		 System.out.println("enter 4 to edit address");
		 System.out.println("enter 5 to delete employee");
//		 System.out.println("enter any other -Invalid option try again");
		 int option=sc.nextInt();
		 IP.takeInput(option);*/
		/* switch(option){
		 	case 1 :IP.makeEmployee();
		 			break;*/
		 	/*case 2 : Add=IP.makeAddress(sc,numEmp);
		 			break;*/
		 	/*case 2: sc.nextLine();
		 			System.out.println("Enter the employee id whose details you want to edit");
		 			s=sc.nextLine();
		 			for(k1=0;k1<IP.getLength();k1++) {
		 				if((E[k1].Id).equals(s)) 
		 					break;
		 				}
		 			IP.editEmployee(k1);*/
		 			/*System.out.println("Enter 1 -First name,2-last name,3-Email ,4-Age,5-Gender");
		 			int j=sc.nextInt();
		 			if(j==1)
		 				IP.editFirstName(sc,k1);
		 			if(j==2)
		 				IP.editLastName(sc,k1);
		 			if(j==3)
		 				IP.editEmail(sc,k1);
		 			if(j==4)
		 				IP.editAge(sc,k1);
		 			if(j==5)
		 				IP.editGender(sc,k1);*/
		 			/*break;
		 	case 3 : System.out.println("Below are the employee details");
		 			 for(int i1=0;i1<IP.getLength();i1++) {
		 				/*EFN=E[i1].getfirstName();
		 				ELN=E[i1].getlastName();
		 				System.out.printf("employee id:"+ EFN.charAt(0) + ELN.charAt(0)+"%05d",(i1+1));*/
		 			//	if(E[i1]!=null)
		 					//System.out.println(E[i1].toString());
						//System.out.println("Details for " + (i1+1) + "th emplyee");
						//Emp[i1].display(Add[i1]);
					 }
					/* break;
		 	case 4: System.out.println("Enter the employee id whose address you want to edit");
		 			sc.nextLine();
		 			s=sc.nextLine();
 					for(k1=0;k1<IP.getLength();k1++) {
 						if((E[k1].Id).equals(s)) 
 							break;
 					}
 					IP.editAddress(k1);*/
		 			/*System.out.println("Enter 1 -House number,2-street name,3-locality ,4-pin code,5-landmark");
 					int j1=sc.nextInt();
 					if(j1==1)
 						IP.editHouseNumber(sc);
 					if(j1==2)
 						IP.editStreetName(sc);
 					if(j1==3)
 						IP.editlocality(sc);
 					if(j1==4)
 						IP.editPinCode(sc);
 					if(j1==5)
 						IP.editLandMark(sc);*/
 			/*		break;
		 	case 5: sc.nextLine();
 					System.out.println("Enter the employee id whose details you want to delete");
 					s=sc.nextLine();
 					for(k2=0;k2<IP.getLength();k2++) {
		 				if((E[k2].Id).equals(s)) {
		 					E[k2]=null;
		 					break;
		 				}
		 			}
 					break;
			default : System.out.println("Invalid option try again");
		 			break;
		 			
		 }*/

	//	} 
		/*String FN = null,LN = null,Email,Gender = null,EFN = null,ELN = null,streetName = null,locality = null,landmark = null;
		int pinCode = 0,houseNumber = 0,c=0,c2=0;
		int Age,num,num2,Value;
		System.out.println("Enter number of employees");
		num=sc.nextInt();*/
		/*for(int i=0;i<num;i++) { 
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
		//System.out.println(Gender);
		if( Gender.charAt(0) != 'F' && Gender.charAt(0)!= 'M' && Gender.charAt(0)!='O') {
			System.out.println("Invalid Gender");
		 	System.exit(0);
		}
		System.out.println("Enter Age");
		Age=sc.nextInt();
		if(Age<18 | Age>45) {
			System.out.println("*********Invalid Age**********");
			System.exit(0);
		}
		sc.nextLine();
		System.out.println("Enter Address details");
		System.out.println("Enter house number");
		houseNumber=sc.nextInt();
		
		System.out.println("Enter street name");
		sc.nextLine();
		streetName=sc.nextLine();
		System.out.println("Enter locality");
		locality=sc.nextLine();
		System.out.println("Enter pin code");
		pinCode=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter land mark");
		landmark=sc.nextLine();*/
		//Employee E= new Employee(FN,LN,Gender,Email,Age);
		//Address A=new Address(houseNumber,streetName,locality,pinCode,landmark);
		/*E.setFirstName(FN);
		E.setLastName(LN);
		E.setGender(Gender);
		E.setAge(Age);
		A.sethouseNumber(houseNumber);
		A.setstreetName(streetName);
		A.setlocality(locality);
		A.setlandMark(landmark);
		A.setpinCode(pinCode);*/
		//Emp[i]=E;
		//Add[i]=A;
		//}
		
		
	/*	System.out.println("Below are the employee details");
		for(int i1=0;i1<numEmp;i1++) {
			System.out.println();
			System.out.println("Details for " + (i1+1) + "th emplyee");
		
		//System.out.printf("employee id:"+ EFN.charAt(0) + ELN.charAt(0)+"%05d",(i1+1));
		//System.out.printf("%05d",(i1+1));
		//System.out.println();
		//System.out.println("Address details "+" "+Add[i1].gethouseNumber()+","+Add[i1].getstreetName()+","+Add[i1].getlocality()+","+Add[i1].getpinCode()+","+Add[i1].getlandMark());
		//Add[i1].display();
			Emp[i1].display(Add[i1]);
		
		}*/
		
	}
		



