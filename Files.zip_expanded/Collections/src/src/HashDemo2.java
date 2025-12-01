package src;
import java.util.HashSet;
import java.util.Iterator;
public class HashDemo2 {
public static void main(String[] args) {
	HashSet h=new HashSet();
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
//	HashSet<Double> h1=new HashSet<Double>();
//	h1.addAll(h);
//	System.out.println(h1);
//	h1.add(10.0);
//	System.out.println(h1);
//	h1.removeAll(h); //removes all the elements in h i.e 2,4,6 and only 10.0 will be saved as it is added in h1.
//	System.out.println(h1);
}}
