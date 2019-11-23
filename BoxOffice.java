package com.constructor;

class BoxOffice {

	public static void main(String[] args) {
		Movie m1=new Movie("Sanju",2018,4.5);
		Movie m2=new Movie("Kabir singh",2019,5);
		Movie m3=new Movie("3idiots",2009,4.8);
		System.out.println("name : "+ m1.name + " year of release : "+m1.yearOfRelease + " rating: "+ m1.rating);
		System.out.println("name : "+ m2.name + " year of release : "+m2.yearOfRelease + " rating: "+ m2.rating);
		System.out.println("name : "+ m3.name + " year of release : "+m3.yearOfRelease + " rating: "+ m3.rating);
		

	}

}
