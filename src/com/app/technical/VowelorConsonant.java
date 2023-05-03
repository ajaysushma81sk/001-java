package com.app.technical;

import java.util.Scanner;

/*Vowel or Consonant in java*/
//input a e i o u ---> vowel
//b c d etc...

public class VowelorConsonant {
	public static void main(String[] args) {
		char ch;
		System.out.println("Enter any Character ");
		Scanner r = new Scanner(System.in);
		ch = r.next().charAt(0);
		
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
		{
			System.out.println("vowel");
		} else {
System.out.println("Consonant");
		}
	}

}
