package com.app.Operator;

import java.util.Scanner;

public class Arithmetic {
	
	public static void main(String[] args) {
		int a, b;
		System.out.println("Enter Tow Number...!!");
		Scanner sc = new Scanner(System.in);
	a=	sc.nextInt();
	b=	sc.nextInt();
	System.out.println("Addition= "  +(a+b));
	System.out.println("Sbtraction= "+(a-b));
	System.out.println("Multiplication= "+(a*b));
	System.out.println("Division= "+(a/b));
	System.out.println("Reminder= "+(a%b));
	}

}
