package com;

import java.util.Scanner;

public class Assignment3 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Activity");
	String TimeTable=sc.next();
	
	switch(TimeTable)
	{
	case"Monday","Wednesday": System.out.println("Monday's or Wednesday's Activity is Basketball");
	break;
	case"Tuesday","Friday": System.out.println("Tuesday's or Friday's Activity is Tennis");
	break;
	case"Thursday": System.out.println("Thursday's Activity is Cricket");
	break;
	case"Saturday": System.out.println("Saturday's Activity is Exercise");
	break;
	case"Sunday": System.out.println("Sunday is a Holiday");

	}
	sc.close();
}
}
