package src;

class Vehicle
{
			public void demo() 
			{
				System.out.println("This is list of Vehicles");
			}
}

class Car extends Vehicle
{
	String carname="BMW";
			public void drive() 
			{
				System.out.println("This is Car details");
			}
}

class Bike extends Vehicle
{
	String bikename="Bajaj";
			public void ride()
			{
				System.out.println("This is Bike details");
			}
}