package com;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		
		//Program to read age of 3 siblings ramu,ragu,raju, store in variable and print age of youngest sibling.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age of Ramu");
		int name1=sc.nextInt();
		
		System.out.println("Enter age of Raghu");
		int name2=sc.nextInt();
		
		System.out.println("Enter age of Raju");
		int name3=sc.nextInt();
		
			if(name1<name2 && name1<name3)
			{
				System.out.println("Ramu is younger and his age is " + name1);
			}
			else if(name2<name1 && name2<name3)
			{
				System.out.println("Raghu is younger and his age is " + name2);
			}
			else 
			{
				System.out.println("Raju is younger and his age is " + name3);
			}			
		
		sc.close();
	}

}
