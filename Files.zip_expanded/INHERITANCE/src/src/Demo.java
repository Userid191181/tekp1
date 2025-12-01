package src;
//method overriding in Demo1 and Demo.java files
public class Demo
{
	public void show()
	{
		System.out.println("this is A show");
	}
	public void config()
	{
		System.out.println("this is config");
	}
}

class B extends Demo
{
	public void show()
	{
		System.out.println("this is B show");
	}
}	


