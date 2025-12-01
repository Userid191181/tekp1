package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Comparator1 implements Comparator<Car>{	
	public int compare(Car x, Car y)
	{
		return x.price-y.price;
	}
public static void main(String[] args) {

Car c1=new Car(900000);
Car c2=new Car(300000);
Car c3=new Car(100);

TreeSet<Car> t=new TreeSet<Car>(new Comparator1());
t.add(c1);
t.add(c2);
t.add(c3);
for(Car c:t)
{
	System.out.println(c);
}}	}
