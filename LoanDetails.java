package com.constructor;

class LoanDetails {

	public static void main(String[] args) {
		Loan l1=new Loan("Home loan",10);
		Loan l2=new Loan("Car loan",8);
		System.out.println("loan name : "+ l1.name + " return of interest: "+ l1.roi);
		System.out.println("loan name : "+ l2.name + " return of interest: "+ l2.roi);

	}

}
