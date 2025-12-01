package src;

public class Laptop {
String laptop;
int price;

public String toString() { // this si explicitly adding a toString method and returning "Hey" as shown below in the result console.
	return laptop + ":" + price; //This returns the laptop and price
	
	
	
	
}
	public static void main(String[] args) {
		Laptop i=new Laptop();
		i.laptop="HP";
		i.price=3000;		
		
		Laptop i1=new Laptop();
		i1.laptop="Compaq";
		i1.price=1000;	
		
		System.out.println(i);		//this implictly call the toStringmethod
		System.out.println(i1.toString());
	}
}
