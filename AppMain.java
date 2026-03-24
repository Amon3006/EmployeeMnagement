// package com.Employees;

// import com.calender.ConsoleInput;

public class AppMain {
	static final int ADD_EMPLOYEE =1,
					 DISPLAY =2,
					 SORT =3,
					 SORT_EMPLOYEES =3,
					 ADD_MANAGER=1,
					 ADD_ENGINEER =2,
					 ADD_SALSEPERSON=3,
					 DISPLAY_LAST =3,
					 DISPLAY_FIRST =2,
					 DISPLAY_ALL =1,
					 BACK =4;

	// static{
	// 	ADD_MANAGER = ADD_EMPLOYEE =1;
	// 	ADD_ENGINEER = DISPLAY =2;
	// 	SORT_EMPLOYEES =ADD_SALSEPERSON =3;
	// 	BACK = 4;

	// }
	
	public static void main(String ... args) {
	Employee [] empArr = new Employee[100];
	int EmpCount = 0;
	int choice = 0;

	
	do{
		System.out.println("1. Add an Employee\r\n"
				+ "2. Display\r\n"
				+ "3. Sort Employees\r\n"
				+ "4.Exit\r\n");
		choice = ConsoleInput.getInt();
		
		switch(choice) {
			case ADD_EMPLOYEE:
				empArr[EmpCount++]=makeEmployee();
				break;
			case DISPLAY:
				display(empArr, EmpCount);
				break;
			case SORT:
				sortCase(empArr, EmpCount);
				break;
			case BACK:
				System.err.println("Yoii-chini-chiwo");
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
			+ "4. BACK\r\n");
	
	subChoice = ConsoleInput.getInt();
	System.out.println("enter name");
	name = ConsoleInput.getString();
	System.out.println("enter Address");
	address = ConsoleInput.getString();
	System.out.println("enter age");
	age = ConsoleInput.getInt();
	System.out.println("enter gender (F/M) ");
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
 


static void sortCase(Employee [] empArr,int EmpCount){
		int subChoice =0;
	do{
		System.out.print("1. sort employees on salary\n"
			+ "2. Sort employees on name\n"
			+ "3. Sort employess on name desc\n"
			+ "4. BACK\r\n");

		subChoice = ConsoleInput.getInt();
	switch(subChoice) {
		case 1:
			sortAllEmployeesOnSalary(empArr, EmpCount);
			break;
		case 2:
			sortEmployeesOnName(empArr, EmpCount);
			break;
		case BACK:
			sortEmployeesOnNameDESC(empArr, EmpCount);
			break;
		}}while(subChoice != 4);

}
static void display(Employee [] empArr,int EmpCount){
	int subChoice =0;
	do{
		System.out.print("1. Display All emp\n"
			+ "2. Display first emp\n"
			+ "3. Display last emp\n"
			+ "4. BACK\r\n");

		subChoice = ConsoleInput.getInt();
	switch(subChoice) {
		case DISPLAY_ALL:
			displayAll(empArr,EmpCount);
			break;
		case DISPLAY_FIRST:
			displayFirst(empArr,EmpCount);
			break;
		case DISPLAY_LAST:
			displayLast(empArr,EmpCount);
			break;
		}}while(subChoice != 4);

}

static void displayFirst(Employee [] empArr,int EmpCount) {
	if(EmpCount ==0){
		System.out.println("No employees");
		return;}
				if(empArr[0] instanceof Manager) {
				System.out.println("\n Designation : manager \n");
			}
			else if(empArr[0] instanceof Engineer) {
				System.out.println("\n Designation :Engineer \n");
			}
			else if(empArr[0] instanceof SalesPerson) {
				System.out.println("\n Designation :SalesPerson \n");
			}
			System.out.println(empArr[0].getInfo());

}

static void displayAll(Employee [] empArr,int EmpCount) {
		for(int i = 0 ;i<EmpCount;i++) {
			if(empArr[i] instanceof Manager) {
				System.out.println("\n Designation : manager \n");
			}
			else if(empArr[i] instanceof Engineer) {
				System.out.println("\n Designation :Engineer \n");
			}
			else if(empArr[i] instanceof SalesPerson) {
				System.out.println("\n Designation :SalesPerson \n");
			}
			System.out.println(empArr[i].getInfo());
		}
	
}

static void displayLast(Employee [] empArr,int EmpCount) {
	if(EmpCount ==0){
		System.out.println("No employees");
		return;}
				if(empArr[EmpCount-1] instanceof Manager) {
				System.out.println("\n Designation : manager \n");
			}
			else if(empArr[EmpCount-1] instanceof Engineer) {
				System.out.println("\n Designation :Engineer \n");
			}
			else if(empArr[EmpCount-1] instanceof SalesPerson) {
				System.out.println("\n Designation :SalesPerson \n");
			}
			System.out.println(empArr[EmpCount-1].getInfo());

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

static void sortAllEmployeesOnSalaryDESC(Employee [] empArr,int EmpCount){
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
	

static void sortEmployeesOnNameDESC(Employee [] empArr,int EmpCount){
	for(int i = 0; i< EmpCount;i++) {
		for(int j = i+1 ; j < EmpCount ; j++) {
		
			if(empArr[i].getName().compareToIgnoreCase(empArr[j].getName())< 0){
				Employee temp;
				temp = empArr[i];
				empArr[i] = empArr[j];
				empArr[j] = temp;
			}
		}
		}
	}



//to be implemented futher
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
