package com.method;
import java.util.Scanner;

class MethodReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  starting number");
		int n=sc.nextInt();
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int [] a1=new int[size];
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=n;
			n++;
		}
		System.out.println("after storing the elements are");
		for(int i=0;i<a1.length ;i++)
		{
			System.out.println(a1[i]);
		}
		int[] a2= new int[size];
		for(int i=a1.length-1,j=0;i>=0;i--,j++)
		{
		a2[j]=a1[i];
		}
		System.out.println("after reversing the elements are");
		for(int j=0 ; j<a2.length;j++)
		{
			System.out.println(a2[j]);
		}

	}

}
