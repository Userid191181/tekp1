package com;

import java.util.Scanner;
public class Assignment {
	public static void main(String[] args) {		
		// to read 2 chars and print the character with smallest ascii
		//a=97, A=65
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        

        char char1 = scanner.next().charAt(0);
        char char2 = scanner.next().charAt(0);


      if(char1<char2)
      {
        	System.out.println("The character with the smallest ASCII value is: " +char1);
      }
      else
      {
    	  System.out.println("The character with the smallest ASCII value is: " +char2);
      }
        
      scanner.close();				
			}
}
