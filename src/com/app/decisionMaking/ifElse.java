package com.app.decisionMaking;

import java.util.Scanner;

public class ifElse {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter any Number..!");
		Scanner r = new Scanner(System.in);
		n=r.nextInt();
		if (n>=0) {
			System.out.println("+ve Number");
		} else {
			System.out.println("-ve Number");

		}
	}

}
