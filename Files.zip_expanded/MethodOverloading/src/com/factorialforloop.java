package com;

import java.util.Scanner;

public class factorialforloop {
	public static void main(String[] args) {
		//Factorial is i.e factorial of 3 is 3*2*1
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int a=1; //declaring a to 1 as this will be multiplied 
		
		for(int i=2; i<=num;i++ )
		{
			a=a*i;
		}
		System.out.println(a);
		
		
		sc.close();
	}

}
