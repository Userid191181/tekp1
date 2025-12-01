package src;

import java.util.Scanner;

public class Practise {	
	{
		System.out.println("Need to buy pen"); //see first these lines in the curly braces wil get executed
		System.out.println("will buy pen"); //see first these lines in the curly braces wil get executed
		System.out.println("------------------------");
	}

	Practise() //this is constructor which will be executed after the non static initializers are executed which is line 4,5,6
	{	
		System.out.println("I have purchased the pen"); //and then this line inside constructor is execuedt.
	}

	public static void main(String[] args) {	
		Practise p=new Practise();	
		Practise p1=new Practise();	
		System.out.println("End of the program");  //this will be execuetd last
	}
	}
