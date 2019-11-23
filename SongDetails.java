package com.constructor;

class SongDetails {

	public static void main(String[] args) {
		Song s1=new Song("DJ wale babu","Badshah");
		Song s2=new Song("Blue eyes","Honey singh");
		System.out.println("song name: "+ s1.name + " song singer : "+ s1.singer);
		System.out.println("song name: "+ s2.name + " song singer : "+ s2.singer);

	}

}
