package com.instanceinitializerblock;

class P1 {
	{
	System.out.println("from IIB-1");	
	}

	public static void main(String[] args) {
		P1 ob1=new P1();
		System.out.println("*****");
		P1 ob2=new P1();
	}
	{
		System.out.println("from IIb-2");
		
		
		

	}

}
