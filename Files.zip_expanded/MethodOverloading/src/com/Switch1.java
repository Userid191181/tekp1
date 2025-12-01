package com;

import java.util.Scanner;

public class Switch1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the time");
	int time=sc.nextInt();
	
	
	switch (time)
	{
	case 5,6,7,8,9,10,11,24: System.out.println("Good morning");
	break;
	case 12,13,14,15: System.out.println("good afternoon");
	break;
	case 16,17,18,19: System.out.println("good evening");
	break;
	case 20,21,22,23: System.out.println("good night");
	break;
	default: System.out.println("Invalid time");
	
	}
	
	
	sc.close();
	
	
	
}
}
