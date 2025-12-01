package Methodloading;

public class CTPolymorphism {
	void add(int x, int y)
	{
		System.out.println("sum of x&y is " +(x+y)) ;
	}
	void add(int x, int y, int z)
	{
		System.out.println("sum of x&y&z is " +(x+y+z));
	}
	
	public static void main(String[] args) {
		CTPolymorphism c=new CTPolymorphism();
				c.add(1, 2);
		c.add(2, 3, 1);
	}

}
