package com.app.technical;

import java.util.Scanner;

/*Count number of Digits*/
//input 3465----> 4

public class NumberOfDigits {
    public static void main(String[] args) {
		int n ,count=0;
		System.out.println("Enter any Number");
		Scanner r = new Scanner(System.in);
		n = r.nextInt();
		
		while (n>0) 
		{
			n = n/10;
			count++;
		}
		System.out.println("No of digits "+count);
	}
}
