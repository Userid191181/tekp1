package src;

abstract class Abstract1 {
	abstract void Demo();
}

abstract class B extends Abstract1{
	abstract void Demo1();
}

class C extends B
{

	@Override
	void Demo1() {
		System.out.println("This is line 1");
		
	}

	@Override
	void Demo() {
		System.out.println("This is line 2");		
	}
	
	public void Demo3()
	{
		System.out.println("fddddddddddddddddddddd");
	}
}