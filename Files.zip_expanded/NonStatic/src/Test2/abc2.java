package Test2;

import Test.abc1;

public class abc2 {
	public static void main(String[] args) {
		abc1 a=new abc1();     //creating Object
		int sum=a.add(4, 6);   //passing arguments to the class abc1		
		System.out.println("Sum of a and b is equal to " + sum);	//Printing the sum of a and b
	}

}
