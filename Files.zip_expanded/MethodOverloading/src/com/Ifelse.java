package com;

import java.util.Scanner;

public class Ifelse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();	
		
		if(a>b) 
		{
		System.out.println(+a);
		}
		else
		{
		System.out.println(+b);
		}
		System.out.println("Thank you");
		
		sc.close();
	}

}
