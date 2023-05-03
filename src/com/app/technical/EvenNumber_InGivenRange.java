package com.app.technical;

import java.util.Scanner;

public class EvenNumber_InGivenRange {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter No of term..!");
		Scanner r = new Scanner(System.in);
		n= r.nextInt();
		for(int i=0; i<=n; i=i+2) {
			System.out.println(i);
		}
	}

}
