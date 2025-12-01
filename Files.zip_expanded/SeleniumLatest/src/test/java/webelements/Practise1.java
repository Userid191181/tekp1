package webelements;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Practise1
{

	public static void main(String[] args) 
	{
		LinkedList fruits = new LinkedList();
		
		fruits.add("apple");
		fruits.add("grapes");
		fruits.add("banana");
		fruits.add("mango");
		System.out.println(fruits);
Iterator i=fruits.iterator();

while(i.hasNext())
{
	System.out.println(i.next());
}
		
	}
	}


