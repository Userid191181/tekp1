package ArrayList;
import java.util.ArrayList;
import java.util.ListIterator;

public class listIterator {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(40);
		al.add("Hari");
		al.add(100);
		al.add('B');
		ListIterator l=al.listIterator(al.size());
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}			
	}
}
