package com.app.technical;

import java.util.Scanner;

public class OddNumber_InGivenRange {
	
	public static void main(String[] args) {
		int n;
		System.out.println("Enter no. of term");
		Scanner r = new Scanner(System.in);
		n=r.nextInt();
		for(int i=1; i<=n; i= i+2) {
			System.out.println(i);
		}
	}

}
