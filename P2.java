package com.instanceinitializerblock;

class P2 {
	int i;
	{
		System.out.println(i);
		i=20;
		System.out.println("from IIB");
	}
	P2()
	{
		System.out.println("from P2()");
	}
	P2(int i)
	{
		System.out.println(this.i);
		this.i=i;
	}

	public static void main(String[] args) {
		System.out.println("main begins");
		P2 ob=new P2();
		System.out.println(ob.i);
		P2 obj=new P2();
		System.out.println(obj.i);
		System.out.println("main ends");

	}

}
