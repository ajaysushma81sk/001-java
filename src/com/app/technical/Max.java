package com.app.technical;

import java.util.Scanner;

/*Maximum number b/w two number */

//input 10 20 ----> 20

public class Max {
	public static void main(String[] args) {
//		int a=10, b=20;
//		if(a>b) {   //10>20
//			System.out.println(a);
//		}else {
//			System.out.println(b);
//		}
		
		int a, b;
		System.out.println("Enter two number");
		Scanner r = new Scanner(System.in);
	a=	r.nextInt();
	b=	r.nextInt();
	
	if (a>b) {
		System.out.println(a);
	} else {
    System.out.println(b);
	}
		
	}

}
