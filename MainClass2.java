package com.downcasting;

class MainClass2 {

	public static void main(String[] args) {
		A3 ob1=new A3(10);
		A3 ob2=new B3(10,20);
		A3 ob3=new C3(500,1000);
		display(ob1);
		display(ob2);
		display(ob3);
		

	}
	public static void display(A3 obj)
	{
		System.out.println(obj.i);
		if(obj instanceof B3)
		{
			System.out.println(((B3)obj).j);
		}
		if(obj instanceof C3)
		{
			System.out.println(((C3)obj).k);
		}
	}

}
