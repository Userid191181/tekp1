package compare2method;

public class Laptop implements Comparable
{
	int price;
	public Laptop(int price)
{
	super();
	this.price=price;
}
	@Override
	public int compareTo(Object obj) {
		Laptop l2=(Laptop) obj;
		if(this.price==l2.price)	//currentobj (this.price (13000))==downcast/passedobj(i2.price(12000))	
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
	Laptop l1=new Laptop(12000);
	Laptop l2=new Laptop(12000);
	System.out.println(l1);
	System.out.println(l2);
	System.out.println(l1.compareTo(l2));
}}
