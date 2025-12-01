package src;

import java.io.InputStream;
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int g=sc.nextInt();		
		System.out.println(g);
		demo();
		demo(4);
		demo("HEllo");

	}
	
	public static void demo()
	{
		System.out.println("This is demo");
	}

	public static void demo(int a)
	{
		System.out.println(a+ "This is demo");
	}
	
	public static void demo(String f)
	{
		System.out.println(f+ "This is demo");
	}
}
