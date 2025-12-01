package MethodOverriding;

public class Animal {
	
		public void demo()  // Same method name and no parameter
		{
			System.out.println("This is class Animal");
			
		}
	
	class Dog extends Animal	
	{
		public void demo() // Same method name and no parameter
		{
			System.out.println("This is class Dog");
		}
	}
	
public static void main(String[] args) {
	Animal a=new Animal();
	a.demo();	
}	
}
