package com.app.technical;

import java.util.Scanner;

/* ASCII value of character*/

//input A--->65


public class ASCII {
	public static void main(String[] args) {
		char ch;
		System.out.println("Enter any Character");
		Scanner r = new Scanner(System.in);
		ch= r.next().charAt(0);
		
		int a = ch;
		System.out.println("ASCII value of" +ch +" is " +a);
		
	}

}
