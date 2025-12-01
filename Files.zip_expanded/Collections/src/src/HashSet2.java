package src;

import java.util.HashSet;
//union , Intersetion
public class HashSet2 {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(2);
		h.add(4);
		h.add(6);
		h.add(8);
		h.add(10);
		//System.out.println(h);	
		HashSet<Integer> h1=new HashSet<Integer>();
		h1.addAll(h);
		h1.add(8); //duplicate number
		h1.add(10); //duplicate number
		h1.add(12);		
		System.out.println("merging h and h1 and removing duplicates" +h1); // eliminating the duplicates		
//		h1.retainAll(h); // show us the common elements b/w 2 lists 
//		System.out.println(h1); // show us the common elements b/w 2 lists 
		h.removeAll(h1); 
		System.out.println(h1); // show us the difference elements b/w 2 lists 
		
	}
}
