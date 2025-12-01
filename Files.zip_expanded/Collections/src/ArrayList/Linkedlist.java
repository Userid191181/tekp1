package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Linkedlist {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add("Hari");
	a.add(1,"Shiva"); //this is pushing Hari to next block and saving Shiva
	a.add('B');
	a.add(10.5);	
//	for(Object k : a)
//	{
//		System.out.println(k);
//		
//	}
	//iterator; prinitng elements using iterator
	Iterator i=a.iterator();
	
	
	
	ArrayList<Integer> ai=new ArrayList<Integer>(); //integer type of data only we are creating
	ai.add(10);
	ai.add(0,90);
	ai.addLast(100);
	
	ArrayList<Object> ao=new ArrayList<>();
	ao.add(10);
	ao.add("Hari");
	ao.add(2, true);
}
}
