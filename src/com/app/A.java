package com.app;

public class A {
	void Show() {
		System.out.println("Show world");
	}
	public static void main(String[] args) {
		A a = new A();
		a.Show();
		System.out.println("Main World");
	}

}
