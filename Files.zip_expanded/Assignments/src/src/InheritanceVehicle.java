package src;

public class InheritanceVehicle {
	void start()
	{
		System.out.println("This ils main for Vehicle to START");
	}
}
class Car extends InheritanceVehicle
{
	void start()
	{
		System.out.println("This is program for Car to override base class");
	}
}

class Bike extends InheritanceVehicle
{
	void start()
	{
		System.out.println("This is program for Bike to override base class123");
	}
}