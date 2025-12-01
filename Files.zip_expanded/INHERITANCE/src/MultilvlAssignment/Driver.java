package MultilvlAssignment;

public class Driver {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.breed="GermanShepard";
		d.color="Brown";
		d.price=5000;
	//System.out.println("Dogs breed is " +d.breed " color is " +d.color " price is " +d.price);
	System.out.println(d.breed);
	System.out.println(d.color);
	System.out.println(d.price);
	d.Demo();
	
	}
}
