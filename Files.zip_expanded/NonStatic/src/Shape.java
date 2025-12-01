//Assignment for 29th May
public class Shape {
	double length;
	double breadth;
	double area;
	
	 Shape(double length, double breadth, double area)
	 {
		 this.length=length;
		 this.breadth=breadth;
		 this.area=area;
	 }
	
	 double trianglearea()
	 {
		return breadth*length*0.5; 
	 }
	 
	 double rectanglearea()
	 {
		 return length*breadth;
	 }
	
	public static void main(String[] args) {
		Shape s=new Shape(2.0, 3.0, 0.0);
		double z=s.trianglearea();
		System.out.println("The area of triangle is: " + z);
		double y=s.rectanglearea();
		System.out.println("The area of rectangle is: " + y);		
	}

}

