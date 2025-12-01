package com;

public class MethodOverloading {
	
	public static void main(String[] args) {

		MethodOverloading rv=new MethodOverloading();
		
		rv.shape(5);
		System.out.println(rv.shape(5));
		rv.shape(2,5);
		System.out.println(rv.shape(2,5));
		//rv.shape(0.5, 2, 4);
}
	
	int shape(int i)
	{
		return i*i;
	}
	int shape(int i, int j)
	{
		return i*j;
	}
//	double shape(double j, double p)
//	{
//		
//	}
}