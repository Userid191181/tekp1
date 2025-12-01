package src;

abstract class B 
{
abstract void demo(int a, int b);
abstract void demo1(String b);	
	
}

class C extends B
{

	@Override
	void demo(int a, int b) {
		int v=a+b;
		System.out.println(v);
		
	}

	@Override
	void demo1(String b) {
		System.out.println(b);
		
	}
		
		
}

