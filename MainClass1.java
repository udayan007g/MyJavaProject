package com.downcasting;

class MainClass1 {

	public static void main(String[] args) {
		A2 ob1=new A2(10);
		A2 ob2=new B2(20,200);
		A2 ob3=new C2(100,200,300);
		display(ob1);
		display(ob2);
		display(ob3);
		
		

	}
public static void display(A2 obj)
{
	System.out.println(obj.i);
	if(obj instanceof B2)
	{
		System.out.println(((B2)obj).j);
	}
	if(obj instanceof C2)
	{
		System.out.println(((C2)obj).k);
	}
}
}
