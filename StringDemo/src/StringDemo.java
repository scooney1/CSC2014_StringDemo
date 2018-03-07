/**
 * Author:	Sam Cooney
 * Project:	StringDemo
 * Date:	Sept. 6, 2017
 * I assert that the program I am submitting is the result of my own efforts. 
 */

import java.util.Scanner;	// Allows use of Scanner.

public class StringDemo { 
	
	public static void main(String[] arg) {
		//
		//------------------------------------Part 1------------------------------------
		//
		System.out.println("***************************************************************");		// This
		System.out.println("*                         Sam Cooney                          *");		// is
		System.out.println("*                          CSC 2014                           *");		// my
		System.out.println("*                         Project #5                          *");		// own
		System.out.println("***************************************************************\n\n");	// box.
		
		//
		//------------------------------------Part 2------------------------------------
		//
		String fName, lName, firstLetter, lName5, fUpper, eToY;	// Declare strings.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		fName = scan.next();					// Read in first name.
		System.out.println("Enter your last name: (Please use more than 5 characters)");
		lName = scan.next();					// Read in last name.
		lName5 = lName.substring(0,5);			// Create substring of last name.
		firstLetter = fName.substring(0,1);		// Create substring of first name.
		System.out.println(firstLetter + ". " + lName5);
		fUpper = fName.toUpperCase();			// Change first name to uppercase.
		System.out.println(fUpper);
		System.out.println("The last name: " + lName + " has " + lName.length() + " letters.");	// Finds length of last name and prints it.
		eToY = lName.replace("e", "Y");			// Replace e with Y in last name.
		System.out.println(eToY + "\n\n");
		
		String m1, m2, m3, m4, m5;				// Declare strings.
		
		m1 = "Quest for the Holy Grail";		// Change string stored in m1.
		System.out.println("\"" + m1 + "\"");
		m2 = m1.toLowerCase();					// Change m1 to lowercase.
		System.out.println(m2);
		m3 = m1.concat(" " + m2);				// Concatenate m1 and m2.
		System.out.println(m3);
		m4 = m3.replace("g", "z");				// Replace g with z.
		System.out.println(m4);
		m5 = m4.substring(6);					// Create a substring of m4.
		System.out.println(m5);
		
		scan.close();							// Close the open scan.
	}	// End of method main. 
}		// End of class StringDemo.