package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistDemo4 {
	public static void main(String[] args) {
		String a[]= {"Dog", "Cat", "Rat"};
		for(String f : a)
		{
			System.out.println(f);
		}
		
		//convert array in to arraylist.
		//ArrayList al=new ArrayList(Arrays.asList(a));
		
		
		
		
		ArrayList g=new ArrayList(Arrays.asList(a));
		//Arrays.asList(a)
		
		
		
	}

}
