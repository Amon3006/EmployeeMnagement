package com.Employees;

public class Engineer extends Employee {
	float OverTime;
	
	Engineer(String name, String address, int age, String gender, float basicSalary,float overtime){
		super(name, address, age,gender,basicSalary);
		setOverTime(overtime);
	}
	public void setOverTime(float overtime){
		
		this.OverTime = overtime;
	}
	
	@Override
	public String getInfo() {
	StringBuffer str = new StringBuffer(super.getInfo());
	str.append("Overtime :");
	str.append(OverTime);
	str.append("\r\n");
	str.append("Total Salary :");
	str.append(getTotalSalary());
	
	return str.toString();}
	
	public float getTotalSalary() {
		return basicSalary+OverTime;
		
	}
}


