package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		p.add(100);
		p.add(100); //duplicates are allowed in the 
		p.add(200);
		p.add(300);
		System.out.println(p.add(400)); //returns true when the addition of value is successful
		System.out.println(p); //insertion order is preserved
//		System.out.println(p.element()); //returns an exception when the head is empty
//		System.out.println(p.peek());//returns null when the head is empty
//		p.remove();//returns exception when the head is empty
//		System.out.println(p); //returns element in head and removes/deletes the element in head
		p.poll();//returns exception when the head is empty
//		System.out.println(p); //returns element in head and removes/deletes the element in head		
		
		Iterator f=p.iterator();
		while(f.hasNext())
		{
			System.out.println(f.next());
		}
		
		}
		
	}
