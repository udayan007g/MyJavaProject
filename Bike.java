package com.hasarelationship;

 class Bike {
	 Engine e=new Engine(100);
	 Engine e2=new Engine(500);
	 String colour;
	 double mileage;
	 Bike()
	 {
	 }
	 Bike(String colour,double mileage)
	 {
		 this.colour=colour;
		 this.mileage=mileage;
	 }

}
