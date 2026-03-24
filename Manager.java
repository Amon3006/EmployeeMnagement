package com.Employees;

public class Manager extends Employee{
	float HRA;
	
	Manager(String name, String address, int age, String gender, float basicSalary,float hra){
		super(name, address, age,gender,basicSalary);
		setHRA(hra);
	}
	public void setHRA(float hra){
		
		HRA = hra;
	}
	@Override
	public String getInfo() {
	StringBuffer str = new StringBuffer(super.getInfo());
	str.append("HRA :");
	str.append(HRA);
	str.append("\r\n");
	str.append("Total Salary :");
	str.append(getTotalSalary());
	return str.toString();}
	
	@Override
	public float getTotalSalary(){
		return basicSalary+HRA;
		
	}
}
