package src;

public interface Test {
	void IDemo();
	void IDemo1();

}

class A implements Test{
	public void IDemo()
	{
		System.out.println("AAAAAAAAAAA");
	}

	@Override
	public void IDemo1() {
		System.out.println("BBBBBBBBBBBBBBBbb");
		
	}
	
}

abstract class BAT implements Test{
	void IDemo2() {
		System.out.println("This is abstartc method");
	}
}

class Z extends A
{

	@Override
	public void IDemo() {
		System.out.println("final");
		
	}

	@Override
	public void IDemo1() {
		System.out.println("final");
		
	}

	
	
}









