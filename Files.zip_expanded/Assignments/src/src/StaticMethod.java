package src;

public class StaticMethod {
	String brand;
	int price;
	static String name;
	
	public void Demo() {
		System.out.println(brand + ":" + price + ":" + name);
	}
	
	public static void Demo1(StaticMethod s1) {
		System.out.println(s1.brand + ":" + s1.brand + ":" + name);
	}
	
	public static void main(String[] args) 
	{
		StaticMethod s=new StaticMethod();
		s.brand="iphone";
		s.price=15000;
		//StaticMethod.name="SmartPhone";
		
		StaticMethod s1=new StaticMethod();
		s1.brand="Apple";
		s1.price=25000;
		//StaticMethod.name="Applephone";		
		StaticMethod.name="SuperPhone";
		
		s.Demo();

		StaticMethod.Demo1(s1);		
	}
}
