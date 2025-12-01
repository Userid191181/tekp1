package src;

public class FibonacciRecursive {

	// Recursive method to find the nth Fibonacci number

	
	
	//FIBONACCI 0,1,1,2,3,5,8
	
	public static void main(String[] args) {
		int a=10;
		for(int i=0; i<a; i++)
		{
		System.out.println(f(i));
		}		
	}
	
	public static int f(int p)
	{
		if(p<=1)
		{
			return p;
		}
		else
		{
			return f(p-1) + f(p-2);
		}
	}
	
	
	
	
}
