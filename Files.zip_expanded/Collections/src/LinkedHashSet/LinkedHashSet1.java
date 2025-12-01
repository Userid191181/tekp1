package LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> h=new LinkedHashSet<Integer>();
		//HashSet h=new HashSet();		
		h.add(100);
		h.add(101);
		h.add(102);
		h.add(900);
		h.add(500);
		h.add(104);
		//System.out.println("RAndomly printing the values as it is HashSet" +h); //insertion is NOT preserved, hence printing the values randomnly		
		System.out.println("Printing the values as it is LinkedHashSet" +h); //insertion is preserved and printing the values in the inserted order.
		h.addAll(h);
	}}