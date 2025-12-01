package src;

public class ShapePolyMethOvrrid {
	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.area(2,3);
	}
}
class Circle extends ShapePolyMethOvrrid
{
	void area(double a, double b)
	{
		double d=3.14;
		double s=d*a*a;
		System.out.println("Area of cirlce for 2 value is" +s);		
	}
}
class Rectangle extends ShapePolyMethOvrrid
{
	void area(double a, double b)
	{
		double s=a*b;
		System.out.println("Area of Rectangle is " +s);
	}
}
class Triangle extends ShapePolyMethOvrrid
{
	void area(double a, double b)
	{
		double s=0.5*a*b;
		System.out.println("Area of Triangle is " +s);
	}
}