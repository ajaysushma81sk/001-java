package com.app.technical;

import java.util.Scanner;

public class SumOfTwoNumber {
	public static void main(String[] args) {
		int a,b,sum;
		System.out.println("Enter two number..");
		Scanner r = new Scanner(System.in);
		a=r.nextInt();
		b= r.nextInt();
		sum=a+b;
		System.out.println("Addition " +sum);
	}

}
