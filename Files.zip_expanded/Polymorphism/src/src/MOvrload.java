package src;


class B extends MOvrload
{
	void Demo()
	{
		System.out.println("This is ovrriding");
	}
}	
public class MOvrload {
	void Demo()
	{
		System.out.println("This is one");
	}
	void Demo1()
	{
		System.out.println("This si string ");
	}
	public static void main(String[] args) //make sure that the main method is under the class file name only, in this case we have main method under class MOvrload
	{
		MOvrload m= new B();
		m.Demo();
		m.Demo1();
	}
}
