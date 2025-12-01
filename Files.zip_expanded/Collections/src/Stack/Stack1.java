package Stack;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		
		Stack s=new Stack(); //supports hetrogeneous data
		s.push(101); //we can use push to add and add method in Stack
		s.add(100);
		s.add("Hari");
		s.push(true);
		System.out.println(s);
		System.out.println(s.pop());// pop will delete the element in stack. This pop will delete true b'coz stack is LIFO so it removes the last inserted element
		System.out.println(s);	}}
