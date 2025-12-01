package com;

public class MethodOverloading2 {
	public static void main(String[] args) {
		int j=add(1,2);
		System.out.println("addition of 2 values is " +j);
		
		int q=add(1,2,3);
		System.out.println("addition of 3 values is " +q);
		
//		int ad=1011111; //implicit type casting
//		long ggg=ad;
//		System.out.println(ggg);
//		
//		long oo=9999;
//		int pp=(int)oo;  //explicit type casting
//		System.out.println(pp);
		
		int mm=(int) demo123(9000222);
		System.out.println(mm);
	}
	
	static int add(int i, int j)
	{
		return i+j;
	}
	
	static int add(int i, int j, int p) {
		return i+j+p;
	}
	
	static long demo123(long e) 
	{
		return e;		
	}

}
