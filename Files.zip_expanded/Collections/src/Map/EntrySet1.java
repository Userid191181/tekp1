package Map;

import java.util.HashMap;

public class EntrySet1 {
public static void main(String[] args) {
	

	HashMap h=new HashMap();
	h.put(101, "Hari");	h.put(102, "Rama");	h.put(103, "Sita");	h.put(110, "Maruti");	h.put(104, "Lakshman");	h.put(109, "Shiva");
	System.out.println(h);
	//entry set is related Entry interface
	//entrySet methods will return all the entries (keys & values) from the table.
	
}}