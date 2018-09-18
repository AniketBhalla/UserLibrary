package com.Aniket.Classes;

public class HashMaping {

	public static void main(String[] args) {

		Person aniket = new Person("aniket");
		System.out.println("Your name : " + aniket.getName());
		aniket.addBooksInRecord("Harry porter", true);
		aniket.addBooksInRecord("Gulliver's Travels", false);
		aniket.addBooksInRecord("In Dark Shadow", true);
		aniket.addBooksInRecord(3);
		System.out.println("your book record -> " + aniket.getYourBooksRecord());
		System.out.println(aniket.getuniqueID());
		aniket.getRegisteredWithLibrary(aniket);
		System.out.println();
		Library.getAllRegisteredLibraryPatronsDetails();
	}

}
