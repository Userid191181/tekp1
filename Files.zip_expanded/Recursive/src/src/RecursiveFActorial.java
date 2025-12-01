package src;

public class RecursiveFActorial {
	public static int factorial(int n) {
        // Base case: Factorial of 0 is 1
        if (n <= 1) {
            return 1;
        } 
        // Recursive case: n * factorial of (n-1)
        else {
            return n * factorial(n - 1);
        }
    }
 
 public static void main(String[] args) {
        int number = 5; // Example number to find factorial
        System.out.println("Factorial of " + number + " is: " + factorial(number));	    }}

