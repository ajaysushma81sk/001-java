package com.app.technical;

import java.util.Scanner;

/* Sum of Odd or Even in Given Number */

//Even 10  (0+2+4+6+8+10=30)
//Odd 11  (1+3+5+7+9+11)


public class SumOfOddEven_InGivenRange {
	public static void main(String[] args) {
		int n,i,sum=0;
		System.out.println("Enter Range..!");
		Scanner r = new Scanner(System.in);
		n= r.nextInt();
		
		if (n%2==0) {
			for(i=0;i<=n;i=i+2) 
			{
				sum = sum+i;
			}
			System.out.println("Sum of Even Number" +sum);
			
		} else {
			for(i=1;i<=n;i=i+2) 
			{
                 sum = sum+i;
	      	}
		System.out.println("Sum of Odd Number " +sum);
	}

	}}
