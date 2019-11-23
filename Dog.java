package com.inheritance;

class Dog extends Animal{
String colour;
Dog(int height,int weight,String colour)
{
	this.height=height;
	this.weight=weight;
	this.colour=colour;
}
	public static void main(String[] args) {
		Dog d1=new Dog(22,27,"white");
		System.out.println(d1.height);
		

	}

}
