package com.app.decisionMaking;

import java.util.Scanner;

public class Simple_if {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter Your Age..!!");
		Scanner r = new Scanner(System.in);
		age = r.nextInt();
		if (age>=18) {
			System.out.println("Eligible for votes..!!");
		}
		System.out.println("Thanku You..!!");
	}

}
