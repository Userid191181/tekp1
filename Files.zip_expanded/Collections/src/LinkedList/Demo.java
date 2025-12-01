package LinkedList;

import java.util.LinkedList;

import ArrayList.Linkedlist;

public class Demo {
public static void main(String[] args) {
	Linkedlist la=new Linkedlist(); //linkedlist also accepts generice i.e it accepts Integer, char,String etc, similar to Arraylist
	LinkedList<Integer> il=new LinkedList<Integer>();
	il.add(100);
	il.add(101);
	il.add(102);
	il.add(103);
	il.add(104);	
	il.add(1, 200); //adding the element in between, this will not shift the existing elements to right side but, 
	//it adds a node with this element	
	for(Integer i: il)
	{
		System.out.println(i);	}}}
