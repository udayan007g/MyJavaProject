package com.constructor;

class P4 {
	{
		System.out.println("from IIB");
		
	}
P4()
{
	System.out.println("from P4()");
}
P4(int i)
{
	this();
	System.out.println("from P4 (int)");
}
P4(float x,double y)
{
	this(100);
	System.out.println("from P4(float,double)");
}
public static void main(String[] args) {
	P4 ob1=new P4();
	P4 ob2=new P4(100);
	P4 ob3 =new P4(2.0f,5.0);
	
}
}
