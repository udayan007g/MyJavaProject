package com.assignment;
import java.util.Scanner;
class ArrayEven {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=kb.nextInt();
		int [] ar= new int[size];
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("enter the even elements "+i);
			ar[i]=kb.nextInt();
			
		}
		for(int x: ar)
		{
			System.out.println(x+1);
		}
		

	}

}
