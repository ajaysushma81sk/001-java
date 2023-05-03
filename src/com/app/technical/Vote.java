package com.app.technical;

import java.util.Scanner;

/*Eligible for Vote or Not*/
//input age >= 18 ----> Vote
// input age<18 ----->not

public class Vote {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter You age..!!");
		Scanner r = new Scanner(System.in);
	   age=	r.nextInt();
	   
	   if (age>=18) {
		System.out.println("Eligible for Vote");
	} else {
               System.out.println("Not Eligible for Vote");
	}
	}

}
