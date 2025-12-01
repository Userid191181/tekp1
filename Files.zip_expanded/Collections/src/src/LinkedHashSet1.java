package src;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
	LinkedHashSet h=new LinkedHashSet();
	h.add(100);
	h.add(1);
	h.add(20);
	h.add(2);
	h.add(30);
	h.add(3);
	h.add(4);
	h.add(5);
	h.add(6);
	h.add(7); 
	System.out.println(h);
	TreeSet<Integer> h1=new TreeSet<Integer>(); //TreeSet is natural sorting so loading all element from LinkedHashset are sorted
	h1.addAll(h);
	System.out.println(h1);
//	h1.addAll(h);
//	h1.add(8); //duplicate number
//	h1.add(10); //duplicate number
//	h1.add(12);		
//	System.out.println("merging h and h1" +h1); // eliminating the duplicates		
	}
}
