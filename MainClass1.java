package com.polymorphism;

class MainClass1 {

	public static void main(String[] args) {
		Bank bank;
		bank=new SBI();
		System.out.println(bank.rateOfInterest());
		bank=new SBIInTouch();
		System.out.println(bank.rateOfInterest());
		bank=new CanaraBank();
		System.out.println(bank.rateOfInterest());
		bank=new Icici();
		System.out.println(bank.rateOfInterest());b
		
		

	}

}
