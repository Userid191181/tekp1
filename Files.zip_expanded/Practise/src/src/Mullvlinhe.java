package src;

public class Mullvlinhe {
String brand;

Mullvlinhe(String brand)
{
	this.brand=brand;
	System.out.println("This is mullvlinhe");
}

void Demo()
{
	System.out.println("This is first line");
}
public static void main(String[] args) {
	Sim s=new Sim("OFC");
	System.out.println(s.brand);
	System.out.println(s.name);
	System.out.println(s.brand);
	s.Demo();
	s.Demo1();
	s.Demo2();
}
}

class Charges extends Mullvlinhe
{
String name;
	Charges(String name)
	{
		super("BTU");
		this.name=name;
	}
	
	void Demo1()
	{
		System.out.println("This is second line");
	}
}

class Sim extends Charges
{
	String sbrand;
	Sim(String sbrand){
	super("MSP");
	this.sbrand=sbrand;
	}
	
	void Demo2()
	{
		System.out.println("This is third line");
	}
}