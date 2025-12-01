package src;

import java.util.LinkedList;

public class LinketList4 {
public static void main(String[] args) {
	//Stack methods in linked list
	LinkedList l=new LinkedList();
	l.add("dog");
	l.add(100);
	l.add("dog");
	l.add(true);
	l.add("G");
	System.out.println(l);
	l.addFirst("Tiger");
	l.addLast("Elephant");
	System.out.println(l.getFirst());
	System.out.println(l.getLast());
	System.out.println(l);
}
}
