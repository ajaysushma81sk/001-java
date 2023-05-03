package com.app.technical;

import java.util.Scanner;

/*Print Character in java*/
// input 10--->10
//input A----->A


public class CharPrint {
	public static void main(String[] args) {
		char ch;
		System.out.println("Please Enter the Charcter..!");
		Scanner r = new Scanner(System.in);
		ch = r.next().charAt(0); // charAt() is string class method jo character ko input liya
		System.out.println(ch);
	}

}
