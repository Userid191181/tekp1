package src;

public class RecursiveFibonacci 
{		    public static int fibonacci(int n) 
		    {
		        if (n <= 1)
		        	{
		        	return n;          // base case 1
		        	}
		        else
		        {
		        	  return fibonacci(n - 1) + fibonacci(n - 2);  // recursive call		        	 
		        }		      
		    }
		    public static void main(String[] args) 
		    {
		        int n = 9;
		        for (int i = 0; i < n; i++) 
		        {
		            System.out.println(fibonacci(i));
		        }
		    }
}
