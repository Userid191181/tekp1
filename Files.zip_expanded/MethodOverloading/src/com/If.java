package com;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age below");
		Double age=sc.nextDouble();
		System.out.println("Hello");
		if(age>=18)
		{
			System.out.println("You are eligible for voting");
		}
		System.out.println("Thank you");
		
		sc.close();
	}

}
