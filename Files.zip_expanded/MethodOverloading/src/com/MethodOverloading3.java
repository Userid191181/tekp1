package com;

public class MethodOverloading3 {
	public static void main(String[] args) {
		
		//find out area of square, circle, rectangle, triangle using methodoverloading
		int a= shape(10);
		System.out.println("Area of Square is " + a);
		
		float b= shape(3,3.142f);
		System.out.println("Area of Circle is " + b);
		
		int c= shape(2,5);
		System.out.println("Area of rectangle is " + c);
		
		double d= shape(2.0,5.0);
		System.out.println("Area of triangle is " + d);		
		
	}
	
	static int shape(int i) {		
		return i*i;		
	}
	
	static int shape(int i, int j) {		
		return i*j;		
	}
	
	static float shape(int i, float j) {		
		return i*i*j;
	}
	
	static double shape(double i, double j) {		
		return i*j/2;
	}
}
