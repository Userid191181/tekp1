package Abstract1;

abstract class Vehicle {
	Vehicle()
	{
		System.out.println("Vehicle Constructor");
	}
}
class Car123 extends Vehicle
{
	Car123()
	{
		//super(); //here we have implicit super () calling statement which is done by compiler.
		System.out.println("This is car constructor");
	}
	public static void main(String[] args) {
		Car123 c=new Car123();//Vehicle constructor	
		System.out.println("Dummy");
	}
}
