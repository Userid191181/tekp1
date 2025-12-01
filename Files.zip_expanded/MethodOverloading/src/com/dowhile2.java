package com;

import java.util.Scanner;

public class dowhile2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		do
		{
			System.out.println("do u wnt to print again");
			System.out.println("type y to print again and n to end");
			ch = sc.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		System.out.println("Statement is done as u selected n");
			
			sc.close();
		
	}

}
