package SeleniumLocators;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test6 {
public static void main(String[] args)  {
		  
	    String str1 = "race";
	    String str2 = "care";
	    

	    // check if length is same
	    if(str1.length() == str2.length())
	    {

			      // convert strings to char array
			      char[] charArray1 = str1.toCharArray();
			      char[] charArray2 = str2.toCharArray();
		
			      // sort the char array
			      Arrays.sort(charArray1);
			      Arrays.sort(charArray2);
		
			      // if sorted char arrays are same
			      // then the string is anagram
			      boolean result = Arrays.equals(charArray1, charArray2);
		
			      if(result) {
			        System.out.println(str1 + " and " + str2 + " are anagram.");
			      }
			      else {
			        System.out.println(str1 + " and " + str2 + " are not anagram.");
			      }
				    }
				    else {
				      System.out.println(str1 + " and " + str2 + " are not anagram.");    }  }
					}
				
	



