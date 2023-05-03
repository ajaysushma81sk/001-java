package com.app.oops;

public class Parameterized_Constructor {
	
	int x,y;
	Parameterized_Constructor(int a, int b ) {   //parameterized
		x=a; y=b;
	}
     
	Parameterized_Constructor(int a, String b) {   
		System.out.println(a+" "+b);
	}
	
	void show() {
		System.out.println(x+"  "+y);
	}
	
	public static void main(String[] args) {
		Parameterized_Constructor ref = new Parameterized_Constructor(100, 200);
		Parameterized_Constructor r = new Parameterized_Constructor(10, "ankush");
		    ref.show();
	}

}
