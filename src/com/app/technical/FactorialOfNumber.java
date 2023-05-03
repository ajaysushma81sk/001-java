package com.app.technical;

import java.util.Scanner;

/*Factorial of number*/
//input 5 ----->120 (5*4*3*2*1)

public class FactorialOfNumber {
	public static void main(String[] args) {
		int n, fact=1;
		System.out.println("Enter any Number");
		Scanner r = new Scanner(System.in);
		n=r.nextInt();
		
		for(int i=1;i<=n;i++) 
		{
		fact = fact*i;
	    }
	System.out.println("Factorial "+ fact);
	}
}
