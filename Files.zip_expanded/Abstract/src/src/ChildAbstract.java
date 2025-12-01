package src;

public class ChildAbstract implements ParentAbstract{
	public static void main(String[] args) {
		
		ChildAbstract d=new ChildAbstract();
		d.Demo1();
		d.Demo2();
		d.Demo3();
		
		
	}

	@Override
	public void Demo3() {
		
		System.out.println("This is line3");
	}

	@Override
	public void Demo1() {
		System.out.println("This is line1");
		
	}

	@Override
	public void Demo2() {
		System.out.println("This is line2");
		
	}

}
