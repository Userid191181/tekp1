package Multilevel;

public class Driver {
	public static void main(String[] args) {
		Car c=new Car();
		System.out.println("car brand is "  +c.brand+  " color is " +c.color);
		c.Driving();
		
		Bike b=new Bike();
		System.out.println("bike brand is "  +b.brand+ " color is " +b.color);
		b.Riding();
	}
}
