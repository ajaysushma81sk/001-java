package com.app.technical;

import java.util.Scanner;

/*Calculate average marks of five Subjects*/
//input 56 78 54 89 76  ------> average

public class Average {
      public static void main(String[] args) {
		int a,b,c,d,e;
		System.out.println("Enter Marks of five subject");
		Scanner r = new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();
		c=r.nextInt();
		d=r.nextInt();
		e=r.nextInt();
		
		int sum = a+b+c+d+e;
		System.out.println("Total Marks "+sum);
		double avg = sum/5.0;
		System.out.println("Average Marks "+ avg);
	}
}
