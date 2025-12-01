package src;

import java.util.Arrays;

public class anagram {
	public static void main(String[] args) {

		String s1="base";
		String s2="sabe";
		
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println("It is anagram");
		}
		else
			System.out.println("Not anagram");
		
		
	}	}

