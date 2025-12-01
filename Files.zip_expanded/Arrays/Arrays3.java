package Arrays;

import java.util.Scanner;

public class Arrays3 {
	public static void main(String[] args) {
		//Dynamic reading the array size and initialization from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int[] a=new int[sc.nextInt()];
				for(int i=0; i<a.length; i++)
				{
					System.out.println("Enter the elements of an Array for " +i);
					a[i]=sc.nextInt();
				}
		
				for(int i=0;i<a.length;i++)
				{
					System.out.println("Fetching the data from each array for " +i);
					System.out.println(a[i]);
				}		
		sc.close();
	}

}