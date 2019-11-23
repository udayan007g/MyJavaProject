package com.hasarelationship;

class College {
	Address a1=new Address("123456","pune");
	String collegeName;
	College(String CollegeName)
	{
		this.collegeName = CollegeName;
	}
	public static void main(String[] args) 
	{
		College c1=new College("abc");
		System.out.println(c1.a1.city);
		System.out.println(c1.a1.pincode);
		System.out.println(c1.collegeName);
		
		

	}
}


