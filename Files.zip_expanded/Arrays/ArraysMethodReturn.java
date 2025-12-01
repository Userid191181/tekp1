package Arrays;
import java.util.Scanner;
public class ArraysMethodReturn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of any Array");
		int[] a=new int[sc.nextInt()];
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter the value of an Array for " +i);
			a[i]=sc.nextInt();		}
		demo(a);
	}
	public static void demo(int[] a)	{
		for(int i=0; i<a.length; i++)		{
			System.out.println("Value of " +i+ " array is " +a[i]);
		}	}   }