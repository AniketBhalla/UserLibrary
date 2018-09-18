package com.Aniket.Classes;

import java.util.HashMap;
import java.util.Scanner;

public class Person {

	private static int COUNTER;
	static {
		COUNTER = 101;
	}

	private String uniqueID;
	private String fullName;
	private int totalBooks;
	private Scanner input;

	private HashMap<String, Boolean> personBookRecordMap; // <Book-name, read or not(completely)>

	public Person(String fullName) { // constructor
		this.fullName = fullName;
		this.personBookRecordMap = new HashMap<String, Boolean>(0); // creating a record map for person
		this.totalBooks = 0;
		this.input = new Scanner(System.in);
		COUNTER++;
		this.uniqueID = COUNTER + "#" + this.fullName; // unique Id = person's name + person counter
	}

	public String getName() { // get name
		return this.fullName;
	}

	public String getuniqueID() {
		return "Your unique ID is : " + this.uniqueID;
	}

	public void addBooksInRecord(String bookName, Boolean isCompletelyRead) { // to add books by persons
		this.personBookRecordMap.put(bookName, isCompletelyRead);
		this.totalBooks++; // one more book added..!!
	}

	public void addBooksInRecord(int howManyBooks) {
		String bookName;
		Boolean isCompletelyRead;
		System.out.println("Enter name of " + howManyBooks + " & true/flase for whether completely read or not..!!"); // like
																														// "harry
																														// porter",
																														// true/false

		for (int count = 0; count < howManyBooks; count++) {

			bookName = input.nextLine();
			isCompletelyRead = input.nextBoolean();
			this.addBooksInRecord(bookName, isCompletelyRead); // adding in hashmap<bookname, readOrNot>

			System.out.println("Book added"); // bookName = null; }
		}
	}

	public String getYourBooksRecord() { // get record of your books

		this.input.close();
		String bookRecordString = "";
		System.out.println("Total Books " + this.fullName + " have : " + this.totalBooks);
		for (String bookNameKey : this.personBookRecordMap.keySet()) {
			bookRecordString = bookRecordString
					.concat(bookNameKey + " : " + this.personBookRecordMap.get(bookNameKey) + ", ");
		}
		return bookRecordString;
	}

	public static void getRegisteredWithLibrary(Person person) {
		Library.getRegisteredWithLibrary(person.uniqueID, person.personBookRecordMap);
	}
}