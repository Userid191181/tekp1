package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArraylistDemo {
	public static void main(String[] args) {
		//Declaring arralylist
		//ArrayList al=new ArrayList(); //this is hetrogeneous data
		//ArrayList<Integer> al=new ArrayList<Integer>(); //homogeneous data
		//ArrayList<String> al=new ArrayList<String>()); //homogeneous data
		//List al=newArrayList();
		// we can use any of the above syntax for declaring the ArrayList.
		ArrayList al=new ArrayList();		
		//Add new elements to the Arraylist
		al.add(10);
		al.add("Welcome");
		al.add('B');
		al.add(true);			
		//			System.out.println(al);	//al.remove(0); //removed 10 as its index is 0 	//System.out.println(al);	//al.remove("Welcome");	//al.remove(2);
		System.out.println(al);
		al.add(2, "JAVA"); //add "JAVA" using index and pushes the subsequent elements to right side.			
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.contains("JAVA")); //returns true if the element is present and false if the element is not present
		System.out.println(al.isEmpty()); //returns true if arraylist is empty 
		//reading the data using for loop
//		for(int i=0; i<al.size(); i++) {
//			System.out.println(al.get(i));
//		}
		//reading the data using for each loop
//		for(Object a : al) //we using Object as Object store hetrogeneous data 'a' is variable which store all the data from "al" and print the content from 'a'
//		{
//			System.out.println(a);
//		}
		//reading elements using iterator method
//		Iterator j=al.iterator();{
//			while(j.hasNext())
//			{
//				System.out.println(j.next()); //printing 
//			}
//		}
		
		
		
		
		
		}
}
