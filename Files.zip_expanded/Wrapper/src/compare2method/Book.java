package compare2method;

public class Book implements Comparable
{
	int price;
	public Book(int price)
{
	super();
	this.price=price;
}
	@Override
	public int compareTo(Object obj) {
		Book l2=(Book) obj;
		if(this.price==l2.price)	//currentobj==downcast/passedobj	
		return 0;
		if(this.price>l2.price)		
			return 1;
		//if(this.price<l2.price)	
		return -1;
	}
	
	public String toString()
	{
		return "price is : " +price;
	}	
	
public static void main(String[] args) {
	Book l1=new Book(10000);
	Book l2=new Book(12000);
	System.out.println(l1);
	System.out.println(l2);
	System.out.println(l1.compareTo(l2));
}
}
