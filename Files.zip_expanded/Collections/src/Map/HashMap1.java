package Map;

import java.util.HashMap;
public class HashMap1 {
public static void main(String[] args) {
	HashMap<Integer,String> h=new HashMap<Integer,String>(); //accepts hetrogeneous data
	h.put(101, "Hari");	h.put(102, "Rama");	h.put(103, "Sita");	h.put(110, "Maruti");	h.put(104, "Lakshman");	h.put(109, "Shiva");
	System.out.println(h);
	for(Object i :h.keySet())
	{
		System.out.println(i);
	}
	for(Object i:h.values())
	{
		System.out.println(i);
	}
	for(Object i:h.keySet())
	{
		System.out.println(i+ "       "+h.get(i));
	}
	}}
