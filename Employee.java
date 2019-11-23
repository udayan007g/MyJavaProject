package com.miscellaneous;

public class Employee {
	int id;
    String name;
    int salary;
    static int x;
    Employee()
    {
    	++x;
    	this.id=x;
    }
    Employee(String name,int salary)
    {
    	this();
    	this.name=name;
    	this.salary=salary;
    }
    static Employee createEmployee(String name,int salary)
    {
    	return new Employee(name,salary);
    	
    }
    Employee initialize(int salary)
    {
    	this.salary=salary;
    	return this;
    }
    Employee display()
    {
    	System.out.println("Employee details");
    	System.out.println(this.id);
    	System.out.println(this.name);
    	System.out.println(this.salary);
    	System.out.println("*********");
    	return this;
    }
    public static void main(String[] args) {
		Employee.createEmployee("ABC",15000).display();
		Employee.createEmployee("DEF",15000).display().initialize(17000).display();
	}

}
