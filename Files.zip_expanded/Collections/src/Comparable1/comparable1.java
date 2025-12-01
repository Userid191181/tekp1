package Comparable1;
import java.util.TreeSet;
public class comparable1 implements Comparable<comparable1>{
int age;
String name;
public comparable1(int age, String name) {
		super();
		this.age=age;
		this.name=name;	}
public String toString() {
	return "Student [age=" +age +", name="+name+"]";}
@Override
public int compareTo(comparable1 s) {
	return this.age-s.age;}
public static void main(String[] args) {
	comparable1 s=new comparable1(27, "smith");
	comparable1 s1=new comparable1(20, "martin");	
	TreeSet<comparable1> t=new TreeSet<comparable1>();
	t.add(s);
	t.add(s1);	
	for(comparable1 student:t) {
		System.out.println(student);
	}	}}
