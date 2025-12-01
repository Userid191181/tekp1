package Test2;

import java.util.Scanner;

public class BuiltInClass1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		System.out.println("Enter the value of c");
		int c=sc.nextInt();

		int add= addition(a,b,c);
		System.out.println("Addition of 3 values are " + add);
		sc.close();
	}
	public static int addition(int x, int y, int z) 
	{
		int sum=x+y+z;
		return sum;
	}



}
