package com.assignment;

class Bookstore {

	public static void main(String[] args) {
	  Books b1= new Books("Gone Girl", 500);
	  Books b2=new Books("The girl on the train",450);
	  Books b3=new Books("Stillhouse lake",1000);
	  Books b4=new Books ("The wife between us",1500);
	  Books b5= new Books ("Behind closed doors",700);
	  Books [] array= {b1,b2,b3,b4,b5};
	  for(Books ob: array)
	  {
		System.out.println("book name "+ ob.name +" book price "+ ob.price +" book isbn "+ ob.isbn); 
		ob.genre("thriller");
	  }
	  

	}

}
