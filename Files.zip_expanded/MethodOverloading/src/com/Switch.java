package com;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		
		switch (a%2)
		{
		case 0: System.out.println(a+" is even");
		break;
		case 1: System.out.println(a+" is odd");
		}
		
		
		sc.close();
		
	}
}
