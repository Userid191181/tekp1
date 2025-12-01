package src;
import java.util.Iterator;
import java.util.LinkedList;
public class Linkedlist2 {
public static void main(String[] args) {
	//LinkedList l=new LinkedList(); //stores hetrogeneous data
	//LinkedList<Integer> l=new LinkedList<Integer>(); //stored homogeneous data (integer)	
	LinkedList l=new LinkedList(); //stores hetrogeneous data
	l.add(100);
	l.add("Hari");
	l.add('B');
	l.add(true);
	l.add(null);	
	System.out.println(l.size());	
	l.set(0, 1000);
	System.out.println(l);
	System.out.println((l.get(3)));
	System.out.println((l.contains("Hari")));
	
	Iterator it=l.iterator();
	while(it.hasNext())
	{		
		System.out.println(it.next());
	}}}