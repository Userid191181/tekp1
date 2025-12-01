package com;

public class MethodOverloading1 {
	public static void main(String[] args) {		
		demo();
		int g=demo(9);
		System.out.println(g);

		demo("hello");
		demo(10.9f);
		
	}
	static void demo(long r) {
		System.out.println(r);
	}
	static void demo()
	{
		System.out.println("first line no 5");
	}
	
	static int demo(int k)	{
		return k;
	}
	
	static void demo(String d) {
		System.out.println(d);
	}
	
	static void demo(float w) {
		System.out.println(w);
	}


}
