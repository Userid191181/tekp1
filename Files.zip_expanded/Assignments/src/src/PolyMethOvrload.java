package src;

public class PolyMethOvrload {
//method overloading with Calculator class having add() methods with different parameter.
	void add()
	{
		System.out.println("This is first line for addition");
	}
	void add(int a, int b)
	{
		System.out.println("Addition of a and b is " +(a+b));
	}
	
	void add(int i, int j, String s)
	{
		System.out.println("Addition of i and j is " +(i+j));
		System.out.println(s);
	}
	public static void main(String[] args) {
		PolyMethOvrload p=new PolyMethOvrload();
		p.add();
		p.add(4,6);
		p.add(3, 6, "HARI");
	}	
}
