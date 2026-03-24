package com.Employees;

import com.calender.ConsoleInput;

public class AppMain {
	
	public static void main(String ... args) {
	Employee [] empArr = new Employee[100];
	int EmpCount = 0;
	int choice = 0;

	
	do{
		System.out.println("1. Add an Employee\r\n"
				+ "2. Display\r\n"
				+ "3. Sort On Salary\r\n"
				+ "4.Sort on Name\r\n"
				+ "5.Exit");
		choice = ConsoleInput.getInt();
		
		switch(choice) {
			case 1:
				empArr[EmpCount++]=makeEmployee();
				break;
			case 2:
				displayAll(empArr,EmpCount);
				break;
			case 3:
				sortAllEmployeesOnSalary(empArr,EmpCount);
				break;
			case 4:
				sortEmployeesOnName(empArr,EmpCount);
				break;
			
		}
		
		
	}while(choice != 4);
	
	
}
	
static Employee makeEmployee() {
	
	int subChoice =0;
	String name;
	String address;
	String gender ;
	int age;
	float basicSalary;

	Employee e = null;
	
	
	System.out.print("1. Manager\n"
			+ "2. Engineer\n"
			+ "3. Sales Person\n"
			+ "4.Exit");
	
	subChoice = ConsoleInput.getInt();
	System.out.println("enter name");
	name = ConsoleInput.getString();
	System.out.println("enter Address");
	address = ConsoleInput.getString();
	System.out.println("enter age");
	age = ConsoleInput.getInt();
	System.out.println("enter gender");
	gender = ConsoleInput.getString();
	System.out.println("enter Salary");
	basicSalary = ConsoleInput.getFloat();

		switch(subChoice) {
		case 1:
			System.out.println("enter HRA");
			float hra = ConsoleInput.getFloat();
			e = new Manager(name,address,age,gender,basicSalary,hra);
			break;
		case 2:
			System.out.println("enter OverTime");
			float OT = ConsoleInput.getFloat();
			e = new Engineer(name,address,age,gender,basicSalary,OT);
			break;
		case 3:
			System.out.println("enter commission");
			float commission = ConsoleInput.getFloat();
			e = new SalesPerson(name,address,age,gender,basicSalary,commission);
			break;
		}
return e;
}
 



static void diaplayFirst(Employee [] empArr,int EmpCount) {
	if(EmpCount ==0){
		System.out.println("No employees");
		return;}
	if(empArr[0] instanceof Manager) {
		Manager m =(Manager)empArr[0];
		System.out.print(m.getInfo());
	}
	else if(empArr[0] instanceof Engineer) {
		Engineer e =(Engineer)empArr[0];
		System.out.print(e.getInfo());
	}
	else if(empArr[0] instanceof SalesPerson) {
		SalesPerson s =(SalesPerson)empArr[0];
		System.out.print(s.getInfo());
	}
}

static void displayAll(Employee [] empArr,int EmpCount) {
		for(int i = 0 ;i<EmpCount;i++) {
			if(empArr[i] instanceof Manager) {
				System.out.println("manager");
				Manager m =(Manager)empArr[i];
				System.out.print(m.getInfo());
			}
			else if(empArr[i] instanceof Engineer) {
				System.out.println("Engineer");
				Engineer e =(Engineer)empArr[i];
				System.out.print(e.getInfo());
			}
			else if(empArr[i] instanceof SalesPerson) {
				System.out.println("SalesPerson");
				SalesPerson s =(SalesPerson)empArr[i];
				System.out.print(s.getInfo());
			}
		}
	
}

static void sortAllEmployeesOnSalary(Employee [] empArr,int EmpCount){
	for(int i = 0; i< EmpCount;i++) {
		for(int j = i+1 ; j < EmpCount ; j++) {
			if(empArr[i].getTotalSalary()>empArr[j].getTotalSalary()) {
				Employee temp;
				temp = empArr[i];
				empArr[i] = empArr[j];
				empArr[j] = temp;
			}
		}
	}
	
}

static void sortEmployeesOnName(Employee [] empArr,int EmpCount){
	for(int i = 0; i< EmpCount;i++) {
		for(int j = i+1 ; j < EmpCount ; j++) {
		
			if(empArr[i].getName().compareToIgnoreCase(empArr[j].getName())> 0){
				Employee temp;
				temp = empArr[i];
				empArr[i] = empArr[j];
				empArr[j] = temp;
			}
		}
		}
	}
	




static void sortAllManagers(Employee [] empArr,int EmpCount){
	for(int i = 0; i< EmpCount;i++) {
		for(int j = i+1 ; j < EmpCount ; j++) {
			if(empArr[i] instanceof Manager && empArr[j] instanceof Manager) {
			if(empArr[i].getTotalSalary()>empArr[j].getTotalSalary()) {
				Employee temp;
				temp = empArr[i];
				empArr[i] = empArr[j];
				empArr[j] = temp;
			}
		}
		}
	}
	
}	
}
