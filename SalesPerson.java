package com.Employees;

public class SalesPerson extends Employee {
	float commission;
	
	SalesPerson(String name, String address, int age, String gender, float basicSalary,float commission){
		super(name, address, age,gender,basicSalary);
		commission(commission);
	}
	public void commission(float commission){
		
		this.commission = commission;
	}
	
	@Override
	public String getInfo() {
	StringBuffer str = new StringBuffer(super.getInfo());
	str.append("commission :");
	str.append(commission);
	str.append("\r\n");
	str.append("Total Salary :");
	str.append(getTotalSalary());
	return str.toString();}
	
	public float getTotalSalary() {
		return basicSalary+commission;
		
	}
	
}
