package src;

import java.util.HashSet;
import java.util.Iterator;
public class HashSet1 {
	public static void main(String[] args) {
		//HashSet hs=new HashSet(); //defaukt capacity is 16, load factore is 0.75
		//HashSet hs=new HashSet(100); //initial capacity is 100
		//HashSet hs=new HashSet(100. (float)0.90);
		//HashSet<Integer> hs=new HashSet<Integer>(); //storing only numbers.
		
		HashSet hs=new HashSet();
		hs.add("Hari");
		hs.add(100);
		hs.add(100);
		hs.add(true);
		System.out.println(hs);
		Iterator h=hs.iterator();
		while(h.hasNext()) {
			System.out.println((h.next()));			
	}
}
}
