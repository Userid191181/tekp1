package LinkedList;

import java.util.LinkedList;
import java.util.Iterator;
import ArrayList.Linkedlist;

public class Student {
	int id;
	String name;
	public Student (String name, int id)
	{
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return "String[id=" +id+ ", name=" +name +"]";
	}
	
	public static void main(String[] args) {
		LinkedList<Student> l=new LinkedList();
		//1st way
		l.add(new Student("martin",101));
		//2nd way
		Student s1=new Student("Smith", 102);
		l.add(s1);
		for(Student g:l)
		{
			System.out.println(g);		}		
	}}