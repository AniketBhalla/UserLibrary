package com.Aniket.Classes;

import java.util.HashMap;

public class Library {

	private static HashMap<String, HashMap<String, Boolean>> LIBRARY_PATRONS_LIST; // unique id, BookRecordMap
	static {
		LIBRARY_PATRONS_LIST = new HashMap<String, HashMap<String, Boolean>>(1);
	}

	static void getRegisteredWithLibrary(String uniqueID, HashMap<String, Boolean> personBookRecordMap) {

		LIBRARY_PATRONS_LIST.put(uniqueID, personBookRecordMap);
	}

	static void getAllRegisteredLibraryPatronsDetails() {

		for (String uniqueID : LIBRARY_PATRONS_LIST.keySet()) {

			System.out.println("Unique ID : " + "\"" + uniqueID + "\" & books record as follows: ");

			for (String BookName : LIBRARY_PATRONS_LIST.get(uniqueID).keySet()) {
				System.out.println(BookName + ":" + LIBRARY_PATRONS_LIST.get(uniqueID).get(BookName) + ", ");
			}
		}

//		return "";
	}

	static String getTotalRegisteredLibraryPatrons() {
		return "Total Registered Patrons : " + LIBRARY_PATRONS_LIST.size();
	}

}
