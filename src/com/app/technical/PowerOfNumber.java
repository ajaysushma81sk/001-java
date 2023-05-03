package com.app.technical;

import java.util.Scanner;

/*Calculate Power of a Number*/

//input n=5
//power p = 3
// 5*5*5 =125

public class PowerOfNumber {
	public static void main(String[] args) {
		int n, p, result=1;
		System.out.println("Enter no.");
		Scanner r = new Scanner(System.in);
    	n=r.nextInt();
    	System.out.println("Enter Power");
    	p=r.nextInt();
    	
    	for(int i=1; i<=p;i++) {
    		result = n*result;
    	}
    	System.out.println("Power "+result);
	}

}
