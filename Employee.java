package com.constructor;

class Employee {
	String name;
	double salary;
	int id;
	Employee(String name,double salary,int id)
	{
		this.name=name;
		this.salary=salary;
		this.id=id;
	}
	public static void main(String[] args) {
		Employee emp1=new Employee("dileep",20000,1014);
		System.out.println("name : "+ emp1.name  + " salary : "+ emp1.salary + " id : "+ emp1.id);
		Employee emp2=new Employee("udyan",20000,1015);
		System.out.println("name : "+ emp2.name  + " salary : "+ emp2.salary + " id : "+ emp2.id);
		
		

	}

}
