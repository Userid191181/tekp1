package src;

import java.util.Scanner;

public class MaxScanner {
	public static void main(String[] args) {
		String s="heloleeh";
		char r ='e';
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==r)
		    {
		    count++;
		    }
		}
		System.out.println(count);
	}

}
