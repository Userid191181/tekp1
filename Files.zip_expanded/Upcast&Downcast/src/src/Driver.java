package src;



public class Driver {
	public static void main(String[] args) {

		Vehicle v=new Car(); //Upcasting 	
		Vehicle v1=new Bike();
		v.demo();

		Car c=(Car) v; //Downcasting
		c.drive();
		System.out.println("Name of he car is " +c.carname);

		Bike b= (Bike) v1; //Downcasting
		b.ride();
		System.out.println("Name of the Bike is " +b.bikename);	

	}
}









