//Assignment for 28th May :

package OOPS;

public class Box {
	int length;
	double area;
	int width;
	Box()
	{
		System.out.println("Start of program");		
	}
	Box(int width)
	{
		this();
		this.length=length;
		System.out.println(width);		
	}
	Box(double area,int width)
	{
		this(width);
		this.area=area;
		System.out.println(area);
		System.out.println(width);		
	}
	Box(int length, double area, int width)
	{
		this(area,width);
		this.length=length;
		System.out.println(length);
		System.out.println(area);
		System.out.println(width);		
	}
	public static void main(String[] args) {
		Box b=new Box(4,20.2,9);				
	}
}
