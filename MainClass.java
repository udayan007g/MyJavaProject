package com.downcasting;

class MainClass {

	public static void main(String[] args) {
		A ob1=new A(10);
		B ob2 = new B(100,200);
		display(ob1);
		display(ob2);
	}
		public static void display(A obj)
		{
			System.out.println(obj.i);
			if(obj instanceof B)
			{
				System.out.println(((B)obj).k);
			}
		}

	}


