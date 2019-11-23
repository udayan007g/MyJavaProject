package com.finalkey;

public class NonStatic {
	final int k=20;
	public static void main(String[] args) {
		NonStatic i=new NonStatic();
		System.out.println(i.k);
		//i.k=20;
	}

}
