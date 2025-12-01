package src;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(10);
al.add(34);
al.add(12);
al.add(90);
al.add(01);

System.out.println(al);

Collections.sort(al);
System.out.println(al);
System.out.println(al.reversed());
Collections.shuffle(al);
System.out.println(al);
}

}
