package Arrays;

import java.util.Scanner;

public class Arrays2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			
		System.out.println("Enter the size of an array");
		int[] a=new int[sc.nextInt()];
		
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		sc.close();
		}		
	}


