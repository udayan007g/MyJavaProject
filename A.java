package com.assignment;

class A {
	int i;
	void initializing(int i)
	{
		System.out.println(i);
		i=20;
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		A obj= new A();
		System.out.println(obj.i);
		obj.initializing(obj.i);
		
		
		
	
	}

}
