package com.app.technical;

import java.util.Scanner;

/*Multiplication Table*/
//input number 6
// 6*1= 6
// 6*2= 12
// 6*3= 18
// 6*4= 24
// 6*5 30
// 6*6 36
// 6*7 42
// 6*8 48
// 6*9 54
// 6*10 60

public class Multiplication_table {
        public static void main(String[] args) {
			int num;
			System.out.println("Enter any Number");
			Scanner r = new Scanner(System.in);
			num = r.nextInt();
			
			for(int i=1; i<=10; i++) {
				System.out.println(num+"*"+i+"="+num*i);
			}
		}
}










