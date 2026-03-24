// package com.Employees;

public abstract class Employee{
	String name;
	String address;
	int age;
	boolean gender;
	float basicSalary;
	

	Employee(String name, String address, int age, String gender, float basicSalary){
		setName(name);
		setAddress(address);
		setAge(age);
		setGender(gender);
		setBasicSalary(basicSalary);
	}

	public boolean setName(String name) {

		if(name == null|| name ==""||name.length()<2){
			name = "";
				return false;
		}
		else {
			this.name = name;
		return true;}
			
		
		}

	public boolean setAddress(String address) {
			if(address == null|| address ==""||address.length()<4){
				return false;
			}
			
		
		else {
			this.address = address;
		return true;}
		
	}

	public boolean setAge(int age) {
		if(age<0 || age > 150) {
		return false;}
		else {
			this.age = age;
			return true;
		}
	}

	public void setGender(String gender) {

		//handel rest of the possible strings other than male and female
		if(gender.equals("M") ||gender.equals("Male") ||gender.equals("male") )
		this.gender = true;
		else if(gender.equals("F") ||gender.equals("Female") ||gender.equals("female"))
			this.gender = false;
	}

	public boolean setBasicSalary(float basicSalary){
		if (basicSalary<1)
			return false;
		else {
		this.basicSalary = basicSalary;
		return true;}
	}
	
	public String getInfo() {
		StringBuffer str = new StringBuffer("Name : ");
		str.append(name);
		str.append("\r\n ");
		str.append("Address :");
		str.append(address);
		str.append("\r\n ");
		str.append("gender : ");
		if(gender)
			str.append("Male");
		else
			str.append("Female");
		str.append("\r\n ");
		str.append("Age : ");
		str.append(age);
		str.append("\r\n ");
		str.append("Salary :");
		str.append(basicSalary);
		str.append("\r\n ");
		return str.toString();
	}
	public String getName() {
		return name;
	}
	
	public abstract float getTotalSalary();
	
}


