package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ArraylistDemo1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("D");
		al.add("B");
		al.add("C");	
		al.add("Z");	
		al.add("K");	
		
		ArrayList ab=new ArrayList();
		ab.addAll(al); //add all the elements from al to ab
		System.out.println("elements from :" +ab);
		System.out.println("elements copied from ab to " +al);
		
		System.out.println("Remove all elements in ab" +ab.removeAll(ab)); //remove all elements in ab
		System.out.println(al);
		System.out.println(ab);

		//to sort - we have Collection.sort() present in Collection and present in util package.
		Collections.sort(al); 
		System.out.println(al); //printing the sorted order
		Collections.reverse(al); //reversing the order
		System.out.println(al); //printing the reverse order.
		
		//shuffle - Collections.shuffle
		Collections.shuffle(al);
		System.out.println("----------------");
		System.out.println(al);
		
		
		
		
	}

}
