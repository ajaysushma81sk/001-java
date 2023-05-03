package com.app.oops;

public class Default_Constructor {
	
	int a; String b; boolean c;
	Default_Constructor() {    // default constructor
		a=100; b= "ankit"; c= true;
	}
	 
	void Disp() {
		System.out.println(a+" "+b+" "+c);
	}
    public static void main(String[] args) {
		Default_Constructor ref = new Default_Constructor();
		ref.Disp();
	}
}
